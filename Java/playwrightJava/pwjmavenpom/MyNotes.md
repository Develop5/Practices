### Playwright Maven using Page Object Model ###

This project will be moved later to Gradle


[Project reference](https://www.youtube.com/watch?v=DyiZnpdDTM4)

[Code repository](https://github.com/PramodDutta/PlaywrightJavaPOM)


[Solid Principles applied (Diagram)](SOLID principle_To_WebAutomation.pdf)



### Resources ###
[Error: maven-compiler-plugin not found](https://stackoverflow.com/questions/60120587/maven-compiler-plugin-not-found)

[SelectorsHub tutorial](https://www.youtube.com/watch?v=Iqp0qh3Up44&list=PLmRg3gEG2XIZRnlY0x0yhBFJSHsdWcSuz&index=3)

[Markdown systax](https://www.markdownguide.org/basic-syntax/)

[Target page](https://app.vwo.com/#/login)

#### Access modifiers ####
<img width="530" alt="Access Modifiers" src="C:\Users\lourd\Documents\Lenovo_D\Lourdes\practicando\Practices\Java\playwrightJava\pwjmavenpom\AccessModifiers.png">



#### In general, where to read codd ####

[open jdk / jdk19](https://github.com/openjdk/jdk19/tree/master/src/java.base/share/classes/java)

[spring-petclinic](https://github.com/spring-projects/spring-petclinic)

#### Show remote origin ####
```
git show origin
```

### Credentials for the web page under test ###
username: 93npu2yyb0@esiix.com 
password: Wingify@123


### I am here ###

If you load the page without trying to login, no problem.
But as soon as you try login and introduce a username and password that did not work the firs time, the CAPTCHA comes in.


### Next step ###

Start other classes with this target page. No login needed.
http://the-internet.herokuapp.com/

Investigate user-agent, to avoid Captcha and probably allow headless execution

### With the new target Heroku ###

Not able to import org.json.simple.parser.JSONParser, then the version was settled in pom.xml
Due to this (new version in pom for org.apache.maven.plugins), the repository for Maven compile in settings started to update

In order to read properties from the commons.json file:
System.out.println("Browser: " + jsonObject.get("browser"));
System.out.println("headless condition: " + jsonObject.get("headless"));


https://playwright.dev/java/docs/api/class-browsertype

https://www.scrapingbee.com/blog/web-scraping-without-getting-blocked/

https://www.zenrows.com/blog/playwright-user-agent#use-a-random-user-agent

https://www.checklyhq.com/learn/headless/challenging-flows/


