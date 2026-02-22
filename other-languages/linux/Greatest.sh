#!/bin/bash
# Description: Find the greatest integer making use of nested if

echo "Enter three integer values"
read a b c
echo "a = $a, b = $b, c = $c"
echo "......................................"
if [ $a -gt $b ]
then
	if [ $a -gt $c ]
	then
		echo "a is the greatest integer"
	else
		echo "c is the greatest integer"
	fi
else
	if [ $b -gt $c ]
	then
		echo "b is the greatest integer"
	else
		echo "c is the greatest integer"
	fi
fi

echo "End of the game. Thanks ..."

