### Overloading ###

**Method overloading** means providing two or more separate methods, in a class, with the **same name**, but **different parameters**.

Method return type may or may not be different, and that allows us to reuse the same method name.

**Overloading** is very handy, it **reduces duplicated code**, and we don't have to remember multiple method names.

We can overload static, or instance methods.

To the code calling an overloaded method, it looks like a single method can be called, with different sets of arguments.

In actuality, each call that's made with a different set of arguments, is calling a separate method.

Java developers often refer to method overloading, as compile-time polymorphism.

This means the compiler is determining the right method to call, based on the method name and argument list.

Usually **overloading** happens within a **single class**.

But methods can also be overloaded by subclasses.

That's because, a subclass inherits one version of the method from the parent class, and then the subclass can have another overloaded version of that method.


### Rules for overloading ###
Methods will be considered overloaded if both methods follow the following rules:
* Methods must have the same method name.
* Methods must have different parameters.

If methods follow the rules above:
* They may or may not have different return types.
* They may or may not have different access modifiers.
* They may or may not throw different checked or unchecked exceptions.
