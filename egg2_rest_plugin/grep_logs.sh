#!/bin/bash 

TOMCAT_HOME=/Users/measter/tools/tomcat_8_5_32_5151

grep -i tracer $TOMCAT_HOME/logs/egg2_rest_plugin.log 

echo "------------------"
echo "Ready."
