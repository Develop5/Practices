

### Boxing ###
It means going from primitive to wrapper. 

### Unboxing ###
Going from wrapper to a primitive.
  

### How to box: ###
Each wrapper has a static overloaded factory method, valueOf(), which takes a primitive and 
returns an instance of a wrapper class.

```
Integer boxedInt = Integer.valueOf(15);
```
Another way to box:

```
Integer boxedInt = new Integer(15);

(Deprecated from JDK9 on)
```

### Autoboxing ###
In fact, we do not need to box primitives manually.

    Integer boxedInt = 15;
Autoboxing is preferred.

### Unboxing ###

It is the preferred way to unbox a wrapper variable.

    Integer boxedIntege = 15;
    int unboxedInt = boxedInteger;

