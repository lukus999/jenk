pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/lukus999/jenk.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building project...'
                // Add your build steps here
            }
        }
        stage('Run') {
            steps {
                echo 'Running project...'
                // Add your run steps here
            }
        }
    }
}
