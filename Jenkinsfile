#!groovy
pipeline {
    agent none
   stages {     
    stage('Maven Install') {
      echo 'Hello'
  }       
  steps {
       sh 'docker ps'
       sh 'mvn clean install'
       }
     }
   }
 }
