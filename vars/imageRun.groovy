#!/usr/bin/env groovy
def call(String firstContainer, String firstImage, String firstHostPort, String secondContainer, String secondImage, String secondHostPort, String containerPort){
        sh 'sudo docker rm -f ${firstContainer} ${secondContainer}'
        sh 'sudo docker run -d -p ${firstHostPort}:${containerPort} --name ${firstContainer} ${firstImage}'
        sh 'sudo docker run -d -p ${secondHostPort}:${containerPort} --name ${secondContainer} ${secondImage}'
 }

       
