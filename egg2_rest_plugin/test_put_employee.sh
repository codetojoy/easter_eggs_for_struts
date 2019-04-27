#!/bin/bash

if [ $# -eq 0 ]
  then
    echo "please pass (a) id and (b) data/file.json as argument"
    exit -99
fi

ID=$1
EMP_FILE=$2

mkdir -p data
cd data

curl -X PUT -d @${EMP_FILE} \
http://localhost:5151/egg2_rest_plugin/employee/$ID \
--header "Content-Type:application/json"

echo "wget result: $?"
echo "" 

cd .. 
echo ""
echo "Ready."
