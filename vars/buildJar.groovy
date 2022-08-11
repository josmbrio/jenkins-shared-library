#!/usr/bin/env groovy

def call() {
    echo "building the Jar"
    sh 'mvn package'
}