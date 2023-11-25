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

[Second target page](http://the-internet.herokuapp.com/)


#### Access modifiers ####
<img width="530" alt="Access Modifiers" src="C:\Users\lourd\Documents\Lenovo_D\Lourdes\practicando\Practices\Java\playwrightJava\pwjmavenpom\AccessModifiers.png">

[How to check a page is loaded](https://sqa.stackexchange.com/questions/26776/how-to-verify-if-a-web-page-has-been-properly-loaded-or-not#:~:text=Verify%20the%20URL%20is%20shown%20as%20expected.%20Verify,above%20are%20met%2C%20a%20page%20is%20loaded%20properly.)

#### In general, where to read code ####

[open jdk / jdk19](https://github.com/openjdk/jdk19/tree/master/src/java.base/share/classes/java)

[spring-petclinic](https://github.com/spring-projects/spring-petclinic)

#### Show remote origin ####
```
git show origin
```

### Credentials for the initial web page under test ###
username: 93npu2yyb0@esiix.com 
password: Wingify@123



### Current page under test ###

After seen the captcha issue (not solved yet) the project has switched target site.
In this one, no login is needed:
http://the-internet.herokuapp.com/

Note: Investigate later about user-agent, to avoid Captcha and probably allow headless execution


#### Highlight a DOM element (Investigate)####
.css('border', '4px solid red')
It works for the console of Chrome DevTools but there is no visible way to introduce it in Playwright.

Example:
$(['h1.heading'][0]).css('border', '7px solid red')


#### Discussions about not being blocked by a Catpcha (Investigate) ####

https://playwright.dev/java/docs/api/class-browsertype

https://www.scrapingbee.com/blog/web-scraping-without-getting-blocked/

https://www.zenrows.com/blog/playwright-user-agent#use-a-random-user-agent

https://www.checklyhq.com/learn/headless/challenging-flows/

### What to execute ###

All tests are in HerokuMainPageTest

### Next steps ### 
 
- Resolve the topics labeled above as "(Investigate)"
- Add pages related to Heroku site with their corresponding tests. Java classes for each of them


