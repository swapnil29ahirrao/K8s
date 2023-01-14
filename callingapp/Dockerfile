FROM openjdk:8-jdk-alpine
VOLUME /main-app
ADD /target/callingapp-0.0.1-SNAPSHOT.jar calling-app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/calling-app.jar"]