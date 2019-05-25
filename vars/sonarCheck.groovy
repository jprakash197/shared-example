#!/usr/bin/env groovy
def call(String mvnHome, String sonarQubeEnv){
   withEnv(["MVN_HOME=${mvnHome}"]){
           withSonarQubeEnv("${sonarQubeEnv}") {
               sh '${MVN_HOME}/bin/mvn sonar:sonar'
             }
        }
           timeout(time: 1, unit: 'HOURS') {
                def qg = waitForQualityGate() 
                if (qg.status != 'OK') { 
                  error "Pipeline aborted due to quality gate failure: ${qg.status}"
                    }
             }
} 
