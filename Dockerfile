# Use an official OpenJDK runtime as a parent image
FROM openjdk:17.0.1-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven-built .jar file from target/ directory to the image
COPY target/SPE_Mini_Project-1.0-SNAPSHOT.jar /app/SPE_Mini_Project-1.0-SNAPSHOT.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/SPE_Mini_Project-1.0-SNAPSHOT.jar"]
