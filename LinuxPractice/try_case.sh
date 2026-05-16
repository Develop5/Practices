#!/bin/bash
# Description: Try Case structure with several number

echo "We have several options: "
echo "1) Print 'Show me the letter!'"
echo "2) Print 'Don't be such a fool'"
echo "3) Print 'Play with another thing, please'"
echo "4) Print 'I am not here, see?'"

echo "Type an integer in this range [1..4]"
read my_number
case "$my_number" in
	1)
		echo "Show me the letter!"
		;;
		
	2)
		echo "Don't be such a fool"
		;;
	3)
		echo "Play with another thing, please"
		;;

	4)
		echo "I am not here, see?"
		;;
	*)
		echo "Invalid option, buddy!"
		;;

esac


