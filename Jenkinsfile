#!groovy
pipeline {
    agent any
   stages {     
    stage('Maven Install') {    
  steps {
       sh 'docker ps'
       sh 'mvn clean install'
       }
     }
   }
 }
