#!/usr/bin/env groovy

def call() {
    echo "building the application"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t josmbrio/my-repo:jma-2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push josmbrio/my-repo:jma-2.0"
    }

}