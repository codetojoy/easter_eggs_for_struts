#!/bin/bash 

TOMCAT_HOME=/Users/measter/tools/tomcat_8_5_32_5151

grep -i tracer $TOMCAT_HOME/logs/egg9_bootstrap.log 

echo "------------------"
echo "Ready."
