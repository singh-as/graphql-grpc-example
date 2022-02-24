#!/bin/bash

gradle build

# build our docker image
docker build -t document-service .