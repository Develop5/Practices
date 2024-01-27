#!/bin/bash
currentbranch=$(git branch --show-current)
gitrepository=$(git remote get-url origin)
echo "GitHub repository: $gitrepository"
echo "You are now back to: $currentbranch"