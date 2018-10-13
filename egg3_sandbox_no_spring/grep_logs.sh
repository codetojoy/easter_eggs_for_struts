#!/bin/bash 

TOMCAT_HOME=/Users/measter/tools/tomcat_8_5_32_5151

grep -i tracer $TOMCAT_HOME/logs/egg3_sandbox_no_spring.log 

echo "------------------"
echo "Ready."
