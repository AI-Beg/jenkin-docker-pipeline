pipeline {
    agent any
    tools{
        maven 'maven 3'
    }
    stages {
        stage('build maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AI-Beg/jenkin-docker-pipeline']])
                sh 'mvn clean install'
                
            }
        }
        stage('build docker image') {
            steps {
               script{
                   sh 'docker build -t jenkin-image/jenkinpipelinedocker .'
                   sh 'docker run -d -p 8083:8082 --name jdcontainer jenkin-image/jenkinpipelinedocker'

               }
            }
        }
         stage('push image to hub') {
            steps {
               script{
                  withCredentials([string(credentialsId: 'docker-hub-pwd2', variable: 'dockerhubpwd2')]) {
                      sh 'docker login -u aibeg -p ${dockerhubpwd2}'
                      sh 'docker tag jenkin-image/jenkinpipelinedocker:latest aibeg/jenkinpipelinedocker:1.3'
                      sh 'docker push aibeg/jenkinpipelinedocker:1.3'
                }
                  
               }
            }
        }
    }
}