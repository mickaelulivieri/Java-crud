FROM eclipse-temurin:17
LABEL maintainer="Mickael"
WORKDIR /application
COPY target/crudSimples-0.0.1-SNAPSHOT.jar /application/arquivodockerfile
ENTRYPOINT ["java", "-jar","arquivodockerfile"]