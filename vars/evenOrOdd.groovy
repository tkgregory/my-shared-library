def call(int buildNumber) {

    node {
        stage('Set vars') {
            Global = 'ding dong'
        }
        stage('Checkout') {
            git url: 'https://github.com/tkgregory/legacy-repo.git'
            sh 'ls'
            def mystuff = load('./common.groovy')
            mystuff.setBinding(binding)
            mystuff.doSomething()
        }
        stage('Even Stage') {
            echo "The build number is even"

        }
    }

}