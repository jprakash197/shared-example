#!/usr/bin/env groovy
def call(String artifatoryEnv, String pattern, String target){
        echo "Hello Artifact 1 ${artifatoryEnv}, ${pattern}, ${target}"
         def server =Artifactory.server "${artifatoryEnv}" 
         def uploadSpec="""{
            "files":[
                        {
                            "pattern":"target/${pattern}",
                            "target":"${target}/"
                        }
                    ]
        }"""
         echo "Hello Artifact 2"
         server.upload(${uploadSpec})
}
