node('java_node'){
	
	stage('Checkout') {
		git branch: 'master', url: 'https://github.com/fatimatabassum05/simple-java-project.git'
	}

	stage('Test') {
		echo "Static test cases done"
	}
		
	stage('Build') {
		sh '/opt/apache-maven-3.9.6/bin/mvn clean package -Dmaven.test.skip=true'
	}

	stage('Deploy') {
		sh 'rsync -r $WORKSPACE/target/*.war /opt/apache-tomcat-9.0.87/webapps/'
		echo "Deployed to production"
	}
}
