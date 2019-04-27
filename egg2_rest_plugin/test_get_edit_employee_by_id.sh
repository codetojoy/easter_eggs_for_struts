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

wget -q http://localhost:5151/egg2_rest_plugin/employee/$ID/edit -O $ID.json

echo "wget result: $?"
echo ""

cat $ID.json

cd ..
echo ""
echo "Ready."
