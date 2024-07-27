## Branch playwrightbdd260724 ##


Playwright Java project using BDD.

Minimum configuration.
No TestRunner is needed.
Have a look at pom.xml file.


The junit-bom is JUnit's Bill Of Materials (BOM). When including this BOM, it will ensure to align and manage all JUnit 5 dependency versions for you. 

Referencing a bom file under <dependencyManagement><dependencies> only manages versions to be compatible. You still need to declare all needed dependencies under <dependencies> but without <version>. Thats how Maven bom references work. IntelliJ can handle them that way too.

You can find more information about the BOM concept as part of:
[Using Maven's BOM](https://reflectoring.io/maven-bom/)


### Page Object Model with Cucumber ###

How to share Test Context between the Cucumber Steps?

R/ [Share data between steps in Cucumber using Scenario Context](https://www.toolsqa.com/selenium-cucumber-framework/share-data-between-steps-in-cucumber-using-scenario-context/)




##
In order to read files in "resources" folder, take into account this:
[How to read a file from a Maven dependency project?](https://stackoverflow.com/questions/28711606/how-to-read-a-file-from-a-maven-dependency-project)

