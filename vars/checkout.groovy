

def call(){
    stage('SCM Checkout'){
        def repoUrl = "https://github.com/wintoo/maven-simple.git";
        def BRANCH_NAME = 'master';
        echo "Building branch ${env.BRANCH_NAME}"
        git url: "$repoUrl", branch: "$BRANCH_NAME"
    }
}   