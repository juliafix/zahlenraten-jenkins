pipeline {

  agent any
  
  stages {
  
    stage ('compile'){
    def mvnHome = tool name: 'localmaven', type: 'maven'
      sh "${mvnHome}/bin/mvn compile"
      steps {
        
        
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
