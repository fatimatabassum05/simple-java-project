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

		stage('Build') {
			steps {
				sh 'mvn clean package'
			}
		}

		stage('Deploy') {
			steps {
				echo "deployed to production"
			}
		}

	}
}
