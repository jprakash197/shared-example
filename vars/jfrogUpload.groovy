#!/usr/bin/env groovy
def call(String artifatoryEnv, String pattern, String target){
         def server =Artifactory.server "${artifatoryEnv}" 
         def uploadSpec="""{
            "files":[
                        {
                            "pattern":"target/${pattern}",
                            "target":"${target}/"
                        }
                    ]
        }"""
         server.upload("${uploadSpec}")
}
