### The record type ###

The record is a special class that contains data, that's not meant to be altered.
In other words, it seeks to achieve immutability, for the data and its members.
It contains only the most fundamental methods, such as constructors and accessors.
Best of all you, the developer, don't have to write or generate any of this code.

###
#### Implicit or generated code that Java provides ####

* Java generates a toString methods that prints out each attribute in a formatted string.
* In addition to creating a final private field for each component, Java generates a public accessor method for each component.
* This method has the same name and type of the component, but it doesn't have any kind of special prefix, not get, or is, for example.
* The accessor method for, for id in this example, is simply id()

###
If you want to change data in your class, you won't be using a record.
You can use the code generation options for the POJO, as shown in the POJO example.

###
**Note**: Pay attention to the format in the record output. You'll see squared brackets and no single quote signs, for example.