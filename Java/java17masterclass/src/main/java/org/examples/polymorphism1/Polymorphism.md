### Polymorphism in action ###

It's the ability to execute different behavior, for different types, which are determined at runtime.

Polymorphism enables you to write generic code, based on the base class, or a parent class.

This code, in the main method, is extendable, meaning it doesn't have to change, as new subclasses become available.

This code can handle any instances that are a Movie, or a subclass of movie, that are returned from the factory method even though it does not exist yeat.

---
### What is var? ###

var is a special contextual keyword in Java, that lets our code take advantage of Local Variable Type inference.

By using var as the type, we'are telling Java to figure out the compile-time for us.

Local Variable Type inference was introduced in Java 10 to reduce boilerplate code and help with readability

---
### Tricks on Run Time and Compile Time ###

In many cases, the compile time is the declared type to the left of the assignment operator.

What is returned on the right side of the assignement operator, from whatever expression or method is executed,
sometimes can only be determined at runtime, when the code is executed conditionally, 
through the statements in the code.

You can assign a runtime instance to a different compile time type only if certain rules are followed.

#### Why are runtime types different than compile times types? ####

Because of polymorphism

Polymorphism lets us write code once, in a more generic fashion, like the code we started this lecture with.

We saw that using a single compile time type of Movie, actually supported four different runtime types.

Each type was able to execute behavior unique to the class.


