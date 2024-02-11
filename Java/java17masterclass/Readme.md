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

## Some notes ##
* FQCN: Full Qualified Class Name

      Consist of the package name and the class name
      Example: com.example.Main

* [Arrays class in Java with all methods](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)


* These statements are quite similar, but different:

      public static void main(String... args)
      public static void main(String[] args)
  
  The difference is minor within the method body, but significant to the code that calls the method.
  
  **Varargs** can be used when we are unsure about the number of arguments to be passed in a method
  
  It creates an array of parameters of unspecified length and such a parameter can be treated as an array in runtime.


* Arrays and Arrays List of reference types

  **Reference types**: anything that is not a primitive type, like a String or any other object.

  When this is an array, the array elements aren't the values
  but the addresses of the reference object or String.
  
  There is a level of indirection.

  ArrayLists are really implemented with arrays, under the covers.

  Objects aren't contiguously stored in memory, but addresses are.


* **Big O Notation**

  It's a way to express how well the operation performs, when applied to more and more elements.
  
  It will help us understand how cheap or expensive an operation performs, when applied to **more and more elements**.

      O(1) - constant time - operation's cost (time) should be constant regardless of number o elements.
      O(n) - linear time - operation's cost (time) will increase linearly with the number of elements n.
      O(1)* - constant amortized time - somewhere between O(1) and O(n), but closer to O(1) as efficiencies are gained.

* **Linked list**
  
  This architecture is known as doubly linked list.
  
  It is a chain of elements where each one is linked to the previous and to the next element.
  
  The beginning is called the **head** and the end is called the **tail**.
  
  It can be considered a queue, a double ended queue because we can traverse both backwards and forwards

* **ArrayList vs Linked List**

  | ArrayList                                                                                             | Linked List                                                                                                                                                                                                  |
  |-------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
  | A better choice for a List, especially if the list is used predominantly for storing and reading data | Use it if you are adding and processing or manipulating a large amount of elements and the maximum elements is not known, or might be great. Or if your number of elements might be exceed Integer.MAX_VALUE |

* **Varargs**

    [Arbitrary Number of Arguments](https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html)

* **Is Java pure OOP?** 
  Java is not pure OOP because it allows primitive type data, among other reasons.


##
#### Voy por aquí ####

(Skipped: codingExercisePlayList)

Section 10: List, ArrayList, LinkedList, Iterator, Autoboxing

143. Autoboxing and Unboxing related to Arrays & Lists

### But, have a look at this once you have time ###

[How To Use Cherry-Pick Git Via CMD/Intellij Tool 2023](https://www.bing.com/videos/riverview/relatedvideo?q=intellij%20tutorial%20cherry-pick&mid=20A2049D273AA51223A920A2049D273AA51223A9&ajaxhist=0)

[ IntelliJ for Cherry Picking](https://www.bing.com/videos/riverview/relatedvideo?&q=intellij+tutorial+cherry-pick&&mid=55C5579BEF377FE9AFCD55C5579BEF377FE9AFCD&&FORM=VRDGAR)

[IntelliJ IDEA: Resolving Merge Conflicts in Git](https://www.bing.com/videos/riverview/relatedvideo?q=intellij%20tutorial%20resolving%20conflicts&mid=1CC30B875C22BFBF0B501CC30B875C22BFBF0B50&ajaxhist=0)



