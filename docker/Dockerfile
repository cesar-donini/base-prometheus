FROM maven:3.5.2-jdk-8-alpine

WORKDIR /opt/base-prometheus

EXPOSE 8080

VOLUME [ "/opt/base-prometheus" ]

ENTRYPOINT [ "mvn", "spring-boot:run" ]