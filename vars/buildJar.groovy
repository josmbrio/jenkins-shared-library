#!/usr/bin/env groovy

def call() {
    echo "building the Jar for branch $BRANCH_NAME"
    sh 'mvn package'
}