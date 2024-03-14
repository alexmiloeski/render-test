FROM maven:3.9.6-amazoncorretto-21
WORKDIR /app
COPY . .
RUN mvn package
EXPOSE 3000
CMD ["java", "-jar", "target/spring-web-jdk17-0.0.1-SNAPSHOT.jar"]
