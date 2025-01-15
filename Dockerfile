FROM openjdk:17-jdk-alpine
ADD target/jenkinPipelineDocker.jar jenkinPipelineDocker.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/jenkinPipelineDocker.jar"]