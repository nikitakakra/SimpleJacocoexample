pipeline {
    agent any
    tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }

    stages {
        stage ('Build') {

            steps {
                 
                   bat 'mvn clean install'
               
            }
        }

        stage ('Testing Coverage') {

            steps {
                junit '**/surefire-reports/TEST-*.xml'
				archive 'target/*.jar'
				step( [ $class: 'JacocoPublisher' ] )
                
            }
        }


        stage ('Deployment Stage') {
            steps {
                
                  echo 'In Deploy stage'
                
            }
        }
      

 }
   post {
  	  always{  	      
  	      junit(testResults: 'target/surefire-reports/*.xml', healthScaleFactor: 1)
  	  }
    }
}
