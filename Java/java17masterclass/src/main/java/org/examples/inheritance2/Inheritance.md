
### Code re-use ###

All subclasses can execute methods, even though the code is declared on the parent class.

The code does not have to be duplicated in each subclass.

We can use code from the parent. Or we can change that code for the subclass.

##
#### Overriding a method ####

Overriding a method is when you create a method on a subclass, which has the same signature as a method on a superclass.

You override a parent class method, when you want the child class to show different behavior from that method

For example, when you create a makeNoise() method on Dog2 and there was another with the same signature on its parent Animal2, the output will show nothing.

In this case you will see that Intellij labels the method  with a small blue square with an "o" and an upper arrow on the left margin of the code pane.

###
The overridden method can do **one of three** things:
* It can implement completely different behavior, overriding the method of the parent.
* It can simply call the parent class's method, which is somewhat redundant to do.
* Or the method can call the parent class's method, and include other code to run, so it can extend the functionality for the Dog, for that behavior.


##
### Polymorphism ###
Simple means "many forms"
Some advantages are:
* It makes code simpler
  * We use code that is in the base class or the superclass. Ex: doAnimalStuff method. We did not have to check the type of the object, and then decide what method to call, Java did it all at runtime.
* It encourages code extensibility
  * It's very easy to subclass and override or extend the method









