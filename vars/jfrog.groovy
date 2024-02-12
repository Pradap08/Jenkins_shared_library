def call(String hostip){
    withCredentials([usernamePassword(
            credentialsId: "artifactory",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        def curll  = "curl -X PUT -u '${USER}:${PASS}' -T target/*.jar http://${hostip}:8082/artifactory/example-repo-local/"
        sh curll
    }
}


