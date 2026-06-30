pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/saivarsha1008/calculator.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac calculator.java'
            }
        }

        stage('Test') {
            steps {
                sh 'java calculator 25 5'
            }
        }
    }
}
