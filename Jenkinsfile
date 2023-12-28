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
            stage('Build-Java8') {
            	tools {
                    jdk "${java8Version}"
                }
                steps {
                    sh "./gradlew build -x test -i"
                }
            }
            stage('Build-Java11') {
            	tools {
                    jdk "${java11Version}"
                }
                steps {
                    sh "./gradlew clean"
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