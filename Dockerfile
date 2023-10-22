FROM openjdk:17
EXPOSE 8080
ADD target/k8-0.0.1-SNAPSHOT.jar k8-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar /k8-0.0.1-SNAPSHOT.jar"]