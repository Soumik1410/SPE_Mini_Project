FROM openjdk:17.0.1-jdk-slim

WORKDIR /app

COPY target/SPE_Mini_Project-1.0-SNAPSHOT.jar /app/SPE_Mini_Project-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/app/SPE_Mini_Project-1.0-SNAPSHOT.jar"]
