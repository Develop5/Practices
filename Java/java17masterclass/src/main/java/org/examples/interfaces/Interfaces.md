
#### Extends and Implements

A class can only extend a single class, which is why Java is called **single inheritance**.

But a class can implement multiple interfaces. This gives us a **plug and play functionality**.

A class can both, extend another class and implement one or more interfaces.

#### _Note_: 
Any method declared **without a body**, is really implicity declared both **public and abstract**.

#### _Note_:
- If we omit an access modifier on a **class member**, it's implicitly package **private**.
- If we omit an access modifier on an **interface member**, it's implicitly **public**.


Changing the access modifier of a method to _protected_, on an interface, is a compiler error
whether the method is concrete or abstract.

Only a concrete _method_ can have _private_ access.

#### _Note_:
Any field declared on an interface are _not_ really instance fields
They are implicitly _public_, _static_ and _final_, which means they are really constants

#### _Note_:
An interfaces **never** gets instantiated.

#### _Note_:
Interfaces can be extended each from another by using the keyword **extends**
An interface can use the **extends** keyword with multiple interfaces
An interface cannot implement another interface, but extend it.
Therefore, **implements** is an invalid word in an interface declaration.

#### _Note_:
Using interface types as a reference type is considered a best practice.

#### _Note_:
Method parameters, method return types, local variable references and class veriables should
try to use interface types as reference variable types, when possible.
This makes the code more extensible in the future.

#### Interface extension method
(as of JDK8)
Identified by the modifier _default_, so it's more commonly known as a default method.
