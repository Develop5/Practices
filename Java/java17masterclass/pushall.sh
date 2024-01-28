#! /bin/bash
#
gitrepository=$(git remote get-url origin)
currentbranch=$(git branch --show-current)
git checkout main
git merge "$currentbranch"
git push
git checkout "$currentbranch"
echo "-------------------------------"
echo "Congrats... All pushed to main!"
echo "-------------------------------"
echo "GitHub repository:   $gitrepository"
echo "You are now back to the branch:   $currentbranch"
