pipeline {

  agent any
  environment {
    PATH = '/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/localmaven/bin/mvn:$PATH'
  }
  
  stages {
    tool name: 'localmaven', type: 'maven'
  
    stage ('compile'){
    
      steps {
        sh 'mvn compile'
        echo 'compiling the application'
      }
    }
    
    stage ("test"){
    
      steps {
        echo 'testing the application'
      }
    }
    
    stage ("deploy"){
    
      steps {
        echo 'deploying the application'
      }
    }
  }
}
