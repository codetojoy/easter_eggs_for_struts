#!/bin/bash

if [ $# -eq 0 ]
  then
    echo "please pass data/file.json as argument"
    exit -99
fi

EMP_FILE=$1

mkdir -p data
cd data

curl --data "name=Liszt&company=Romantic" http://localhost:5151/egg2_rest_plugin/employee

# curl -X POST -d @${EMP_FILE} \
# http://localhost:5151/egg2_rest_plugin/employee \
# --header "Content-Type:application/json"

echo "wget result: $?"
echo "" 

cd .. 
echo ""
echo "Ready."
