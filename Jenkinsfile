#!groovy
pipeline {
    agent none
   stages {     
    stage('Maven Install') {    
  steps {
       sh 'docker ps'
       sh 'mvn clean install'
       }
     }
   }
 }
