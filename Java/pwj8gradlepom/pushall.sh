#! /bin/bash
#
git checkout main
git merge pwj8gradlepom
git push
git checkout pwj8gradlepom
alias showurl='git remote get-url origin'
alias currentbranch='git branch --show-current'
echo "-------------------------------"
echo "Congrats... All pushed to main!"
echo "-------------------------------"
currentbranch=$(git branch --show-current)
gitrepository=$(git remote get-url origin)
echo "GitHub repository: $gitrepository"
echo "You are now back to: $currentbranch"
