# Stage 1: Build the application
FROM openjdk:21 AS build
LABEL authors="thgssilva"
LABEL description="API COURSES/STUDENTS"
# Set the working directory
WORKDIR /app

# Copy the Maven wrapper and pom.xml
COPY mvnw ./
COPY .mvn .mvn
COPY pom.xml ./

# Make the Maven wrapper executable
RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline -B

# Copy the source code
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:21

# Set the working directory
WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/students-courses-api-0.0.1-SNAPSHOT.jar students-courses-api.jar

# Expose port 8080
EXPOSE 8080

# Define the entrypoint
ENTRYPOINT ["java", "-jar", "students-courses-api.jar"]
