#!/bin/bash
# Description: Using SELECT
select everyfile in /*
do
	echo "$everyfile"
	echo
	if [ -d $everyfile ]
	then
		echo "$everyfile is a directory"
	else
		echo "$everyfile is not a directory"
	fi
done

