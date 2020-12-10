pipeline {

  agent any
  
  tools {
    maven 'localmaven'
  }
  
  stages {
  
    stage ('Compile'){
      
      steps {
        sh 'mvn compile'
        echo 'compiling the application'
      }
    }
    
    stage ("Test"){
    
      steps {
        sh 'mvn test'
        echo 'testing the application'
      }
    }
    
    stage ("Package"){
    
      steps {
        sh 'mvn package'
        echo 'create .jar-file'
      }
    }
    
    stage ("Clean"){
    
      steps {
        sh 'mvn clean'
        echo 'cleaning the application'
      }
    }
  }
}
