FROM openjdk:17-jdk-alpine
ADD target/jenkinPipelineDocker.jar jenkinPipelineDocker.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/jenkinPipelineDocker.jar"]