###### Source: "Code Review Checklist: Why You Need It & How To Use It Effectively"     https://www.tabnine.com/blog/code-review-checklist/


## Before committing or merging code...

&nbsp;
### Readability and Maintainability
Different developers have varied methods of working on code towards a goal. Most developers I’ve worked with like to jump into the grit of things and start messing around until it works. This method of development can generate unreadable and unmanageable code. Once the code works, you should reevaluate it to see if it meets a good standard. It may be prudent to rewrite the code, or it may only need some formatting, in-line documentation and readability changes.

- Is the code understandable?
    > Can someone who has never seen it clearly understand what the code does without help? If not, you may want to break the code down into smaller functions or add comments.


- Are packages and namespaces in order? 
    > Something as simple as this can create an unnecessary headache down the road.


- Does the code chance achieve the desired result simply and effectively?
    >  Now that you know how the solution works, can you think of a better one? Simple code is easier to maintain.


- Does the code formatting and styling adhere to your organization’s standards?
    > Formatting conventions help with readability as code becomes integrated into other code.


- Can variables, method names, or classes be renamed to improve readability?
    > Sometimes, making names longer can help explain the code without the need for comments.


- Can the code’s readability be improved by breaking up methods into smaller ones?
    > Big bulky methods are harder to understand. Splitting methods into smaller ones not only helps understand them but giving them meaningful names makes for self-documenting code.


- Should a comment explain why the code was designed the way it was?
    > Sometimes, self-documenting code isn’t enough, and a comment that gives an overview of the design is needed.

&nbsp;
### Performance and Databases
While rapid prototyping encourages developers to write quick and dirty code and worry about performance when necessary, some applications rely on performance to deliver a good user experience. If your application requires good performance, make sure you have several items on your checklist to address it.

- Should the new code be profiled for performance?
    > If performance is of concern, running the code through a profiler is the first step in learning if changes need to be made.


- Are there any logging or debugging code that should be removed?
    > Logging in the wrong place can have a significant impact on performance.


- Is caching or lazy loading used where applicable?
    > Caching and Lazy loading are two common ways to improve performance.


- Is the correct data structure being used to store collections?
    > Should your collection be a set or a list?


- Is the most efficient data type used for the expected values?
    > Database types can be fine-tuned to be memory efficient based on the expected values.


- Could a Stored Procedure be used instead of code?
    > Stored procedures are often a better solution than code, both for maintainability and performance.


- Can performance be improved by indexing?
    > Sometimes adding an Index can help, sometimes removing one can. Make sure indexing is used correctly.


- Are queries returning unnecessary data that could be trimmed?
    > Returning too much data is wasteful. Make sure you’re querying for the data you need.


&nbsp;
### Security
Security is a serious concern these days, and shifting left security as early as possible can save resources and reduce risk.

- Are your queries sanitized against SQL injections?
    > SQL injections are an easy avenue of attack. Make sure to take the necessary precautions.


- Do error messages give too much information to potential attackers?
    > Sometimes, error messages can hand would-be attackers the keys to the fort. Be informative, but not too informative.


- Is Authentication and Authorization handled correctly?
    > If the code area doesn’t directly deal with authentication and authorization, it might still need to do security checks.


- Is user input validated?
    > You don’t want user input to go unchecked.
                             >