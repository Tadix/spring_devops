FROM ubuntu
RUN apt-get update && apt-get install openjdk-17-jdk vim curl -y
WORKDIR /opt
ADD target/devops-*.jar devops.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "devops.jar"]