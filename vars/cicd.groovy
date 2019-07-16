def body() {
    node {
        stage('First Stage'){
            firstStage.call()
        }

        stage('Second Stage'){
            secondStage.call()
        }
    }    
}