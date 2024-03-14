FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/THEAPP.jar /app/THEAPP.jar
EXPOSE 8080
CMD ["java", "-jar", "THEAPP.jar"]
