#!/bin/bash

ID=newEmp

mkdir -p data
cd data
touch $ID.json
rm $ID.json

wget -q http://localhost:5151/egg2_rest_plugin/employee/editNew -O $ID.json

echo "wget result: $?"
echo ""

cat $ID.json

cd ..
echo ""
echo "Ready."
