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
				echo "Static test cases done"
			}
		}
		
		stage('Build') {
			steps {
				sh '/opt/apache-maven-3.9.6/bin/mvn clean package -Dmaven.test.skip=true'
			}
		}

		stage('Deploy') {
			steps {
				sh 'cp -r $WORKSPACE/target/*.war /opt/apache-tomcat-9.0.86/webapps/'
				echo "Deployed to production"
			}
		}
	}
}
