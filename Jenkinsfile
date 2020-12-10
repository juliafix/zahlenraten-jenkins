pipeline {

  agent any
  
  stages {
  
    stage ('compile'){
    def mvnHome = tool name: 'localmaven', type: 'maven'
      steps {
        
        sh "${mvnHome}/bin/mvn compile"
        echo "compiling the application"
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
