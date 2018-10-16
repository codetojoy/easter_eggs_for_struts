#!/bin/bash 

TOMCAT_HOME=/Users/measter/tools/tomcat_8_5_32_5151

wget http://localhost:5151 -o tmp.log -O tmp.html

if [ $? == 0 ]; then
    echo "shutting down"
    $TOMCAT_HOME/bin/shutdown.sh

    echo "confirmation ..."
    sleep 0.8
    ./ping_tomcat.sh 
else
    echo "Tomcat not running"
fi 

rm tmp.log tmp.html 

echo "Ready."
