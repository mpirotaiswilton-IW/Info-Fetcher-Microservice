FROM curlimages/curl

COPY init_services.sh /tmp/init_services.sh

WORKDIR /tmp

USER root
RUN chmod +x ./init_services.sh
USER 1001

ENTRYPOINT [ "/tmp/init_services.sh" ]