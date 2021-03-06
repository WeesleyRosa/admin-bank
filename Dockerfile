FROM openjdk:11

EXPOSE 8080

RUN mkdir -p /opt/application/jar
WORKDIR /opt/application/jar
COPY build/libs/bank-0.0.1-SNAPSHOT.jar /opt/application/jar/bank-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", \
    "-jar", \
    "/opt/application/jar/bank-0.0.1-SNAPSHOT.jar" ]