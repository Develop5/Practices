#! /bin/bash
#
git checkout main
git merge java17masterclass
git push
git checkout java17masterclass
alias showurl='git remote get-url origin'
echo "-------------------------------"
echo "Congrats... All pushed to main!"
echo "-------------------------------"
