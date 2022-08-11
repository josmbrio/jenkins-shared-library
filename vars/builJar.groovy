#!/usr/bin/env groovy

def call() {
    echo "building de app"
    sh 'mvn package'
}