
### Generic type parameters ###

The most common idenfiers are:

* E for Element (used extensively by the Java Collection Framework)
* K for Key (used for mapped types)
* N for Number
* T for Type
* V for Value
* S, U, V for 2nd, 3rd and 4th types


### Raw usage ###

You can use generic classes without specifying a type parameter. 
This is call the **Raw Use** of the reference type.

The raw use of these classes is still available, for backwards compatibility,
but it's discouraged for several reasons.

### Exceptions ###

We cannot use a generic class with any of primitive types.
We need wrappers instead.


### Generic classes can limit the type that can use them ###

The word 'extends' inside the angle brackets in a generic declaration 
doesn't have the same meaning as 'extends'  when it's used in class declaration.

    public class Team <T extends Player> {...}

This means that the parameterized type T has to be a Player or a subtype of Player.
Player could be a class or an interface. The syntax would be the same.

#### Why specify an upper bound? ###
Permits access to the bounded type's functionality.
Limits the kind of type parameters. The type used must be "equal to, or a subtype of..."