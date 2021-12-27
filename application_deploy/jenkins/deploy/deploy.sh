#!/bin/bash

#DOCKER_ID=subhajenkinsdeploy 
BUILD_VER=$APP_VERSION
ENV=$1
REG=$2
IMAGE=$3

#docker login -u $DOCKER_ID -p $DOCKER_PASSWORD

#docker pull $DOCKER_ID/$IMAGE:$APP_VERSION

#docker run -it -p 9090:8080 --name server_product_app -d $DOCKER_ID/$IMAGE:$APP_VERSION


CONTAINER_NAME="server_${ENV}_${REG}_$IMAGE"

echo $ENV $REG $IMAGE $CONTAINER_NAME

echo "Removing existing containers"
docker rm -f $CONTAINER_NAME
echo "Starting new container"
docker run -it -p 8080 --name $CONTAINER_NAME -d $IMAGE:$BUILD_VER
