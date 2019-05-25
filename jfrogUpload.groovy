#!/usr/bin/env groovy
def call(String artifatoryEnv, String pattern, String target){
var server =Artifactory.server "${artifatoryEnv}" 
        var uploadSpec="""{
            "files":[
                        {
                            "pattern":"target/${pattern}",
                            "target":"${target}/"
                        }
                    ]
        }"""
         server.upload(${uploadSpec})
}
