FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY target/Devops-*.jar /app/my-spring-boot-app.jar

EXPOSE 8080

CMD ["java", "-jar", "my-spring-boot-app.jar"]
