def GIT_BRANCH = 'develop';

def call() {
    timeout(time: 60, unit: 'SECONDS') {
     GIT_BRANCH = input(
        message: 'Set branch name:',
        parameters: [
            string(name: "branchName", description: "Branch to deploy, default is ${GIT_BRANCH}", defaultValue: "${GIT_BRANCH}")
            ]
        )
        echo "IN VARS: ${GIT_BRANCH}"
    }
    return GIT_BRANCH
}