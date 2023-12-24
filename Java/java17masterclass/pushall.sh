#! /bin/bash
#
git checkout main
git merge java17masterclass
git push
git checkout java17masterclass
echo "Congrats... All pushed to main!"
