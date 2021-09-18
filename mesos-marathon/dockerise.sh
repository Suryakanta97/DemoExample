#!/usr/bin/env bash
set -e
docker login -u mogronalol -p $DOCKER_PASSWORD
docker build -t surya/mesos-marathon-demo:$BUILD_NUMBER .
docker push surya/mesos-marathon-demo:$BUILD_NUMBER
