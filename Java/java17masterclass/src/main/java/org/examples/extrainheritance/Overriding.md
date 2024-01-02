### Overriding ###
##
Method overriding means defining a method in a child class, that already exists in the parent class, with the same signature (the **same name**, **same arguments**).

By extending the parent class, the child class gets all the methods defined in the parent class (those methods are also known as derived methods).

**Method overriding** is also known as **Runtime Polymorphism**, or **Dynamic Method Dispatch**, because the method that is going to be called, is decided at runtime, by the Java virtual machine.

When we **override** a method, it's recommended to put **@Override**, immediately above the method definition.

The @Override statement is not required, but it's a way to get the compiler to flag an error, if you don't actually properly override this method.

We'll get an error, if we don't follow the overriding rules correctly.

We can't override static methods, **only instance methods** can be overridden.

### Overriding rules ###

A method will be considered overridden, if we follow these rules.
* It must have the same name and same arguments.
* The return type can be a subclass of the return type in the parent class.
* It can't have a lower access modifier.  In other words, it can't have more restrictive access privileges.
* For example, if the parent's method is protected, then using private in the child's overridden method is not allowed.  However, using public for the child's method would be allowed, in this example.


There's also some important points about method overriding to keep in mind.
* Only **inherited methods** can be overridden, in other words, methods can be overridden only in child classes.
* Constructors and private methods cannot be overridden.
* Methods that are final cannot be overridden.
* A subclass can use super.methodName() to call the superclass version of an overridden method.

