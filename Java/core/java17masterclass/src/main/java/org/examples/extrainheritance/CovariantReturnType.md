### Covariant Return type ###

The return type of an overridden method can be the same type as the parent method's declaration.

But it can also be a subclass.

The term, covariant return type, is more appropriate.

But in general, when you're cloning an instance, you're going to want to return an Object, that's the same type as the Object you are cloning.

Remember, we said all classes ultimately have Object as a base class, so every class can be said to be a covariant of Object.
##