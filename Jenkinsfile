pipeline{
	agent any
	stages {
		stage('Checkout') {
			steps {
				git branch: 'master', url: 'https://github.com/fatimatabassum05/simple-java-project.git'
			}
		}

		stage('Test') {
			steps {
				echo "static test cases done"
			}
		}

	}
}
