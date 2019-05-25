#!/usr/bin/env groovy
def call(String mvnHome){
withEnv(["MVN_HOME=${mvnHome}"]){
  sh '${MVN_HOME}/bin/mvn clean install'
   }
 }
