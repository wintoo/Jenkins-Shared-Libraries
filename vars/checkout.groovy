def repoUrl = "https://github.com/wintoo/maven-simple.git"
def BRANCH_NAME = 'master'
        
def call(){
    stage('SCM Checkout'){
        echo "Building branch ${env.BRANCH_NAME}"
        git url: $repoUrl, branch: $BRANCH_NAME
    }
}   