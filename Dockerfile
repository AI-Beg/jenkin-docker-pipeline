FROM openjdk:17-jdk-alpine
ADD target/jenkinPipelineDocker.jar jenkinPipelineDocker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/jenkinPipelineDocker.jar"]