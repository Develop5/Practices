#!/bin/bash
# Description: Display content if user input is a regular file or directory

echo "Please, enter a valid file or directory path"
read path
echo "Entered path is: $path"
if [ -f $path ]
then
	echo "File is either a regular file or directory."
	echo "I'm going to show you its content..."
	echo "----------------------------------------------"
	echo
	cat $path
elif [ -d $path ]
then
	echo "File is a directory and its content is: "
	ls $path
else
	echo "Neither a valid regular file nor directory"
fi

