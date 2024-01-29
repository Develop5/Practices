# Java 17 master class #

Reviewing the course with the same name
https://www.udemy.com/share/101Wdq3@OliW-dXtu66pyzllIOE0_PGS-U1fhWVdsPd8zwBZxX0ZslMDeMRhSGUGLINlrl8=/


### Introduction to JShell ###

The Java Shell tool (JShell) is an interactive tool for learning the Java programming
language and prototyping Java code. JShell is a Read-Evaluate-Print Loop (REPL),
which evaluates declarations, statements, and expressions as they are entered and
immediately shows the results. The tool is run from the command line.

The only thing you need to do to start with JShell is to type the command at the CLI:
```
jshell
```
[JShell tutorial](https://examples.javacodegeeks.com/java-development/core-java/java-9-jshell-tutorial/)

#### Some JShell commands ####
```
/help intro         Provides general instructions on how to use it
/help               List of commands
/list -all          List of built-in code
{                   Long code starts. The prompt changes to ...>
```
JShell has a **default startup script** that is silently and automatically executed before JShell starts, so that you can get to work quickly. 

Entries from the startup script aren’t listed unless you request them with the /list -start or /list -all command.

#### Some tips and resources ####

1. Avoid to be asked for a merge message by adding this to the .bash_profile:
    
    export GIT_MERGE_AUTOEDIT=no

Then reload your .bash_profile file from the commad line with this:

    ~/ .bash_profile

2. [Markdown table syntax](https://www.tablesgenerator.com/markdown_tables#:~:text=As%20the%20official%20Markdown%20documentation%20states%2C%20Markdown%20does,which%20provide%20additional%20syntax%20for%20creating%20simple%20tables.)
3. [Extended Markdown syntax](https://www.markdownguide.org/extended-syntax/#tables)
##
#### Needs to read ####
6.71 Exception Handling, and Introduction to Scanner
5.57 More switch statement      (and around)

**Can be Skipped**: From Section 30 to 44 this is all old content
##


## Other useful readings ##

[Baeldung tutorials](https://github.com/eugenp/tutorials/tree/master)

### Move the following to any testing project ###
[@BeforeAll in JUnit returns null](https://stackoverflow.com/questions/63452807/using-beforeall-to-instantiate-an-object-in-junit-returns-null)


#### Voy por aquí ####

115. OOP Master Challenge Exercise, The Bonus
     Need to check the project structure, as java files are not executable right now.


[See if it is gradle](https://stackoverflow.com/questions/14093024/trying-gradle-build-task-build-not-found-in-root-project)

No idea if it works, but when I create a new project, everything works, as normal.
So, there must be something that was changed in the configuration of he current one.
Probably in Intellij, though.