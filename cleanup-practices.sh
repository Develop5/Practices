#!/bin/bash

# ============================================================
# CLEANUP EXISTING PRACTICES REPOSITORY
# Reorganizes existing content to match new structure
# ============================================================

set -e

WORK_DIR="$HOME/github-consolidation"

echo "============================================================"
echo "CLEANUP EXISTING PRACTICES REPOSITORY"
echo "Reorganizing to match new structure"
echo "============================================================"
echo ""

cd "$WORK_DIR/Practices"

echo "Creating new directory structure..."

# Create new folders
mkdir -p java/core
mkdir -p other-languages/{vba,linux,jmeter,behave,concordion}
mkdir -p testing

echo ""
echo "Moving existing content to new structure..."

# Move Java content
if [ -d "Java" ]; then
    echo "  → Moving Java/ to java/core/"
    mv Java/* java/core/ 2>/dev/null || true
    rmdir Java 2>/dev/null || true
fi

# Move VBA
if [ -d "VBA" ]; then
    echo "  → Moving VBA/ to other-languages/vba/"
    mv VBA/* other-languages/vba/ 2>/dev/null || true
    rmdir VBA 2>/dev/null || true
fi

# Move Linux
if [ -d "LinuxPractice" ]; then
    echo "  → Moving LinuxPractice/ to other-languages/linux/"
    mv LinuxPractice/* other-languages/linux/ 2>/dev/null || true
    rmdir LinuxPractice 2>/dev/null || true
fi

# Move JMeter
if [ -d "JMeter" ]; then
    echo "  → Moving JMeter/ to other-languages/jmeter/"
    mv JMeter/* other-languages/jmeter/ 2>/dev/null || true
    rmdir JMeter 2>/dev/null || true
fi

# Move Behave
if [ -d "Behave" ]; then
    echo "  → Moving Behave/ to other-languages/behave/"
    mv Behave/* other-languages/behave/ 2>/dev/null || true
    rmdir Behave 2>/dev/null || true
fi

# Move Concordion
if [ -d "concordion2" ]; then
    echo "  → Moving concordion2/ to other-languages/concordion/"
    mv concordion2 other-languages/concordion/concordion2 2>/dev/null || true
fi

if [ -d "concordiondemo" ]; then
    echo "  → Moving concordiondemo/ to other-languages/concordion/"
    mv concordiondemo other-languages/concordion/concordiondemo 2>/dev/null || true
fi

# Move Docker if exists
if [ -d "MrCodeDev-Docker" ]; then
    echo "  → Moving MrCodeDev-Docker/ to other-languages/docker/"
    mkdir -p other-languages/docker
    mv MrCodeDev-Docker/* other-languages/docker/ 2>/dev/null || true
    rmdir MrCodeDev-Docker 2>/dev/null || true
fi

# Handle SeleniumPython file
if [ -f "SeleniumPython" ]; then
    echo "  → Moving SeleniumPython file to other-languages/"
    mv SeleniumPython other-languages/selenium-python 2>/dev/null || true
fi

# Clean up old config files (keep .gitignore and .github)
echo ""
echo "Cleaning up old configuration files..."
rm -f ideaGitConfig pushall.sh 2>/dev/null || true

echo ""
echo "Current directory structure:"
tree -L 2 -I '.git' || find . -maxdepth 2 -type d ! -path '*/\.*' | sort

echo ""
echo "Committing cleanup..."
git add -A
git commit -m "chore: reorganize existing Practices content to match new structure"
git push origin main

echo ""
echo "✓ Cleanup complete!"
echo ""
echo "Next steps:"
echo "  1. Review the new structure on GitHub"
echo "  2. Verify all content was moved correctly"
echo "  3. Then we'll proceed with consolidation script"
