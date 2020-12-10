pipeline {

  agent any
  
  stages {
  
    stage ("compile"){
    
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
