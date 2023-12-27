
### Code re-use ###

All subclasses can execute methods, even though the code is declared on the parent class.

The code does not have to be duplicated in each subclass.

We can use code from the parent. Or we can change that code for the subclass.


#### Overriding a method

Overriding a method is when you create a method on a subclass, which has the same signature as a method on a superclass.

You override a parent class method, when you want the child class to show different behavior from that method

For example, when you create a makeNoise() method on Dog2 and there was another with the same signature on its parent Animal2, the output will show nothing.