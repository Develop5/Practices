#!/bin/bash
# Description: Get the PID of the named application
# Pidof does not work in this distribution. So, try another command

echo "Enter application name"
while read askingline
do
	echo -n "Running PID of application $askingline : "
	pidof $askingline
done

