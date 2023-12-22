### Some definitions about constructors ###

A constructor is used in the creation of an object, that's an instance of a class.

It is a special type of code block that has a specific name and parameters, much like a method.

It has the same name as the class itself, and it doesn't return any values.

You never include a __return__ type from a constructor, not even void.

You should specify an appropriate access modifier, to control who should be able to create new instances of the class.

    public class Account { // This is the class declaration
    
        public Account { // This is the contructor declaration
            // constructor code is the code to be executed as the object is created
        }
    }
    