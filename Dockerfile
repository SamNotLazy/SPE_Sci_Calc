# Stage 1: Build the Java application using Maven
FROM maven:3.8.5-openjdk-18 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project files (pom.xml and source code) to the container
COPY pom.xml .
COPY src ./src

# Build the application (compile the code and package it into a JAR file)
RUN mvn clean package -DskipTests

# Stage 2: Create a minimal image with the JAR file
FROM openjdk:18-jdk-slim

# Set working directory
WORKDIR /app

# Copy the packaged JAR file from the build stage
COPY --from=build /app/target/SPE_Sci_Calc-1.0-SNAPSHOT.jar /app/app.jar

# Expose the port your application will run on (assuming 8080)
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
