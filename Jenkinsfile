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
                 
                  
                     jacoco(classPattern: '**/classes', deltaBranchCoverage: '0', deltaClassCoverage: '0', deltaComplexityCoverage: '0', deltaInstructionCoverage: '0', deltaLineCoverage: '0', deltaMethodCoverage: '0', execPattern: '**/**.exec', maximumBranchCoverage: '0', maximumClassCoverage: '0', maximumComplexityCoverage: '0', maximumInstructionCoverage: '0', maximumLineCoverage: '0', maximumMethodCoverage: '0', minimumBranchCoverage: '0', minimumClassCoverage: '0', minimumComplexityCoverage: '0', minimumInstructionCoverage: '0', minimumLineCoverage: '0', minimumMethodCoverage: '0', sourcePattern: '**/src/main/java')
                     junit(testResults: 'target/surefire-reports/*.xml', healthScaleFactor: 1)
                
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
