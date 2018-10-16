#!/bin/bash 

TOMCAT_HOME=/Users/measter/tools/tomcat_8_5_32_5151

grep -i tracer $TOMCAT_HOME/logs/egg5_sandbox.log 

echo "------------------"
echo "Ready."
