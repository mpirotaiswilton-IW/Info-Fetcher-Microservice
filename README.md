# Info-Fetcher-Microservice

This Github repository contains a Springboot Microservice with a Postgres Database and a Kong API Gateway that can be dockerized:

## Summary

[Info-Fetcher-Microservice](#info-fetcher-microservice)
* [Summary](#summary)
* [Setup and Pre-requisites](#setup-and-pre-requisites)
* [Running Microservice](#running-microservice)


## Setup and Pre-requisites

1. If not already installed:

- Install Docker on your device (you can use the following link for a guide: [https://docs.docker.com/get-docker/](https://docs.docker.com/get-docker/))
- Install the latest version of OpenJDK 17 on your device (The following page has a complete catalogue of OpenJDK downloads: [https://www.openlogic.com/openjdk-downloads](https://www.openlogic.com/openjdk-downloads))

2. Clone this repository or download the .zip file from GitHub (extract the downloaded zip file )

## Running Microservice

1. Using a Command Line Interface used to run Docker and docker-compose commands, change directory to the downloaded/cloned repository

2. Run the following command: 

```
docker-compose up
```

3. 3 docker containers should now be running:
    * `info-fetcher-microservice-api`: where the spring-boot api image, built using a Dockerfile, is containerized
    * `db`: where a Postgres database is containerized and used by the API
    * `naughts-and-crosses-pgadmin`:

4. The microservice is now running and ready for use.

## Kong API Gateway Set-up

## 