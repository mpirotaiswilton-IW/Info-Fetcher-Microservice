#!/bin/sh
result=0
correct=200

while [ "$result" -ne "$correct" ]
do
    result=`curl -s -o /dev/null -w "%{http_code}" http://kong-gateway:8001/`
    sleep 1
done

echo "Connection to Kong Gateway established"

echo "Setting up PeopleGet service..."

curl -i -X POST \
--url http://kong-gateway:8001/services/ \
--data name=PeoplePerson-Get \
--data 'url=http://microservice:8080/person/'

echo "Setting up PeopleGet service routes..."

curl -i -X POST \
--url http://kong-gateway:8001/services/PeoplePerson-Get/routes/ \
    -H "Content-Type: application/json" \
    -d '{"name": "PeoplePerson-GetRoute", "methods":["GET"], "hosts":["localhost"], "paths":["/person"]}'

echo "Set-up complete"