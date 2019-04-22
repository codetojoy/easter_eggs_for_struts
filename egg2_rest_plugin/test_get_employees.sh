#!/bin/bash

RESULT=employees

mkdir -p data
cd data
touch $RESULT.json
rm $RESULT.json

wget -q http://localhost:5151/egg2_rest_plugin/employee -O $RESULT.json

echo "wget result: $?"
echo "" 

cat $RESULT.json

cd .. 
echo ""
echo "Ready."
