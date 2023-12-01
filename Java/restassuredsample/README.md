## How to execute tests from command line ##
```
Select "src" folder as Project Structure as sources module

./gradlew clean test --info 
```
&nbsp;

From this folder:
```
~/Documents/Lenovo_D/Lourdes/practicando/Practices/Java/restassuredsample
```

### Pending tasks ###
- [x] Part 3 Reports with log4j2
- [ ] Start with playlist for Rest Assured

I stopped here:
https://www.youtube.com/watch?v=r5R_TViegfY&t=45s
&nbsp;


This is not a playlist but several chapters.
&nbsp;

&nbsp;

The following is a playlist for Rest Assured:
https://www.youtube.com/playlist?list=PLUDwpEzHYYLvLZX_QEGTNolPvNADXid0I



&nbsp;
### Log levels ###

**TRACE** – log events with this level are the most fine-grained and are usually not needed unless you need to have the full visibility of what is happening in your application and inside the third-party libraries that you use. You can expect the TRACE logging level to be very verbose.

**DEBUG** – less granular compared to the TRACE level, but still more than you will need in everyday use. The DEBUG log level should be used for information that may be needed for deeper diagnostics and troubleshooting.

**INFO** – the standard log level indicating that something happened, application processed a request, etc. The information logged using the INFO log level should be purely informative and not looking into them on a regular basis shouldn’t result in missing any important information.

**WARN** – the log level that indicates that something unexpected happened in the application. For example a problem, or a situation that might disturb one of the processes, but the whole application is still working.

**ERROR** – the log level that should be used when the application hits an issue preventing one or more functionalities from properly functioning. The ERROR log level can be used when one of the payment systems is not available, but there is still the option to check out the basket in the e-commerce application or when your social media logging option is not working for some reason. You can also see the ERROR log level associated with exceptions.

&nbsp;
#### And also... ####
&nbsp;
**ALL** indicates that all messages should be logged.

**CONFIG** is a message level for static configuration messages.

**FINE** is a message level providing tracing information.

**FINER** indicates a fairly detailed tracing message.

**FINEST** indicates a highly detailed tracing message.

**INFO** is a message level for informational messages.

**OFF** is a special level that can be used to turn off logging.

**SEVERE** is a message level indicating a serious failure.

**WARNING** is a message level indicating a potential problem.



[Makdown Guide](https://www.markdownguide.org/basic-syntax)