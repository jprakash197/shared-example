#!/usr/bin/env groovy
def call(String imageName){
 // sh 'sudo docker build -t jyoti_img .' 
    sh 'sudo docker build -t "${imageName}" .' 
 }
