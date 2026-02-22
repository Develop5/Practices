
### Overloading and Overriding ###

##

| **Overloading**                                                       | **Overriding**                                                                   |
|-----------------------------------------------------------------------|----------------------------------------------------------------------------------|
| Provides functionality to reuse a method name with different parameters | Used to override a behavior which the class has inherited from the parent class. |
| Usually in a single class but may also be used in a child class.      | **Always in two classes** that have a child-parent or IS-A relationship.         |
| **Must have** different parameters.                                   | **Must have** the same parameters and same name.                                 |
| May have different return types.                                      | Must have the same return type or covariant return type(child class).                                                                                 |
| May have different access modifiers(private, protected, public).      | **Must NOT** have a lower modifier but may have a higher modifier.                                                                                 |
| May throw different exceptions.                                       | **Must NOT** throw a new or broader checked exception.                                                                                 |

##

Resources:
[Markdown table generator](https://www.tablesgenerator.com/markdown_tables)
[Markdown syntax guide](https://www.markdownguide.org/extended-syntax/#markdown-processors)

