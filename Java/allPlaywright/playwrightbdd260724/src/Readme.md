## Branch playwrightbdd260724 ##

### Current step ###
Make it similar to:
[playwright-cucumber-jvm](https://github.com/drl-repo/playwright-cucumber-jvm/tree/main)
Folder copy in: Java/allPlaywright/playwrightbdd260724/Borrar
**_DELETE this folder after use_**



### Playwright Java project using BDD.###

Minimum configuration.
No TestRunner is needed.
Have a look at pom.xml file.


The junit-bom is JUnit's Bill Of Materials (BOM). When including this BOM, it will ensure to align and manage all JUnit 5 dependency versions for you. 

Referencing a bom file under <dependencyManagement><dependencies> only manages versions to be compatible. You still need to declare all needed dependencies under <dependencies> but without <version>. Thats how Maven bom references work. IntelliJ can handle them that way too.

You can find more information about the BOM concept as part of:
[Using Maven's BOM](https://reflectoring.io/maven-bom/)


### Page Object Model with Cucumber ###

How to share Test Context between the Cucumber Steps?


[Using Hooks for Setup and Teardown in Cucumber](https://www.unrepo.com/cucumber/using-hooks-for-setup-and-teardown-in-cucumber-tutorial)

[Share data between steps in Cucumber using Scenario Context](https://www.toolsqa.com/selenium-cucumber-framework/share-data-between-steps-in-cucumber-using-scenario-context/)


Just in case the last one does not work for sharing context, have a look at this:
[Getting @BeforeAll and @AfterAll behaviour with Cucumber JVM and JUnit](https://metamorphant.de/blog/posts/2020-03-10-beforeall-afterall-cucumber-jvm-junit/)

##
In order to read files in "resources" folder, take into account this:
[How to read a file from a Maven dependency project?](https://stackoverflow.com/questions/28711606/how-to-read-a-file-from-a-maven-dependency-project)

Playwright version downgraded to 1.26.0

**Next steps:**
1.- Read config.properties from src/test/resources/config/config.properties
and configure browser accordingly
    Use Playwright factory in main folder
