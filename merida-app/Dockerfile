FROM openjdk:20-jdk-slim

COPY target/merida-app-0.0.1-SNAPSHOT.jar merida-app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/merida-app.jar"]