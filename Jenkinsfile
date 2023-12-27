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
                    sh "./gradlew -b clean"
                }
            }
            stage('Build') {
                steps {
                    sh "./gradlew -b build -x test -i"
                }
            }

            stage('Test') {
                
                steps {
                    sh "./gradlew -b test"
                }
            }
        }
    }