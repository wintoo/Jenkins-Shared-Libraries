def call(){
    node {
        stage('SCM Checkout') {
            checkout scm
        }
        // Execute different stages depending on the Job
        if(env.JOB_NAME.contains("deploy")){
            packageArtifacts()
        }else if(env.JOB_NAME.contains("test")){
            buildAndTest()
        }
    }
}

def packageArtifacts(){
    stage("Package artifact"){
        sh "mvn package"
    }
}

def buildAndTest(){
    stage("Backend tests"){
        sh "mvn test"
    }
}
