pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }
            stage('Clean') {
                steps {
                    sh "./gradlew clean"
                }
            }
            stage('Build') {
                steps {
                    sh "./gradlew build -x test -i"
                }
            }

            stage('Test') {
                
                steps {
                    sh "./gradlew test"
                }
            }
        }
    }