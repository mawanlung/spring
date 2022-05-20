#!groovy
pipeline {
    agent none
   stages {     
    stage('Maven Install') {
      agent any
  }       
  steps {
       sh 'docker ps'
       sh 'mvn clean install'
       }
     }
   }
 }
