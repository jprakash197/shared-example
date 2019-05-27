#!/usr/bin/env groovy
def call(String firstContainer, String imageName, String firstHostPort, String secondContainer, String secondHostPort, String containerPort){
        sh "sudo docker rm -f ${firstContainer} ${secondContainer}"
        sh "sudo docker run -d -p ${firstHostPort}:${containerPort} --name ${firstContainer} ${imageName}"
        sh "sudo docker run -d -p ${secondHostPort}:${containerPort} --name ${secondContainer} ${imageName}"
 }

       
