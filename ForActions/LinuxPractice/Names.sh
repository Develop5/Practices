#!/bin/bash
# Description: Iterating over a list

declare -a names=(Luis Miguel Pedro Armando Carlos)
echo "Content of names array: ${names[*]}"
echo
for each_name in ${names[@]}
do
	echo -n "$each_name "
done
echo

