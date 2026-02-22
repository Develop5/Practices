### Differences between "super" and "this" keywords ###

A constructor can have a call to **this()** or **super()**, but never both.
###
**super**
```
* Used to access or call the parent class members (variables and methods)
* It is commonly used with method overriding, when we call a method with the same name from the parent class.
* The only way to call a parent constructor is by calling super()
* The java compiler puts a default call to super(). 
    If we don't add it, it is always a call to the no-argument constructor, which is inserted by the compiler.
* The call super() must be the first statement in each constructor.

```

**this**
```
* Used to call the current class members (variables and methods)
* **this** is required when we have a parameter with the same name, as an instance variable or field.
* Use this() to call a constructor from another overloaded constructor in the same class
* The call to this() can only be used from a constructor, an must be the first statement in a constructor.
    It is used in a constructor chaining, in other words, when one constructor calls another constructor
    and it helps to reduce duplicated code.

```

##
**NOTE**: We can use either of them anywhere in a class, except for static elements, like static method.
Any attempt to do so there, will lead to compile time errors.

