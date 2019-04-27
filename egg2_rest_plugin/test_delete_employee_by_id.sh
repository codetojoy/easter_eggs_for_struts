#!/bin/bash

if [ $# -eq 0 ]
  then
    echo "please pass id as argument"
    exit -99
fi

ID=$1

mkdir -p data
cd data
touch $ID.json
rm $ID.json

curl -X DELETE  \
http://localhost:5151/egg2_rest_plugin/employee/${ID} \
--header "Content-Type:application/json"

echo "wget result: $?"
echo ""

cd ..
echo ""
echo "Ready."
