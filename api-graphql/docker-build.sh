#!/bin/bash

gradle build

# build our docker image
docker build -t api-graphql .