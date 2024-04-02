pipeline{
	agent {label 'java_node'}
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
				sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
			}
		}

		stage('Deploy') {
			steps {
				echo "deployed to production"
			}
		}
	}
}
