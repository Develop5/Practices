#! /bin/bash
#
git checkout main
git merge pwj8gradlepom
git push
git checkout pwj8gradlepom
alias showurl='git remote get-url origin'
echo "-------------------------------"
echo "Congrats... All pushed to main!"
echo "-------------------------------"
