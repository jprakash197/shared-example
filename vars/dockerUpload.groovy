#!/usr/bin/env groovy
def call(String userNameDocker, String passwordDocker, String imageName ){
         sh "sudo docker login -u ${userNameDocker} -p ${passwordDocker}"
         sh "sudo docker tag ${imageName} jprakash197/${imageName}"
         sh "sudo docker push jprakash197/${imageName}"
}
