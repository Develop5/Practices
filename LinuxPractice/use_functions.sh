#!/bin/bash
# Description: How to declare and use a function with arguments in a script

mytoUpper()
{
	echo
	if [ $# -eq 1 ]   # Do you have only one argument?
	then
		echo "Output :  $1" | tr '[a-z]' '[A-Z]'
		variable_result=0
	else
		echo "Not converting. You have entered more than 1 argument."
		variable_result=3

	fi
	echo "Input parameters : $@"
	echo "Program result code: $variable_result"
	echo " ............"
}
mytoUpper "dandy"
mytoUpper danDy
mytoUpper "Long message: more than 1 word (inside quotation marks)"
mytoUpper weird mESSage: more THAN 1 without quotation marks
mytoUpper 





