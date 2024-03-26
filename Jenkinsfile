pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Git checkout
                git 'https://github.com/JonasWolfram/spring-boot-blog-rest-api.git'
            }
        }

        stage('Build') {
            steps {
                // Maven build
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Copy artifact to deployment directory
                sh 'cp target/*.jar /path/to/deployment/directory'
            }
        }
    }

    post {
        success {
            echo 'Build succeeded! Deploying...'
            // Add post-build actions here
        }

        failure {
            echo 'Build failed!'
            // Add failure handling actions here
        }
    }
}
