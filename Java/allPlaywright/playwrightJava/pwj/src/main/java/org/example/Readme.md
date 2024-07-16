
## Reference
[laywright for Java](https://playwright.dev/java/)


### 
[Markdown syntax](https://www.markdownguide.org/basic-syntax/)

### MAVEN

To "activate" Maven, from the CLI:

    export PATH=${PATH}:${MAVEN_HOME}/bin:C:\Users\lourd\Documents\Tools\Maven\apache-maven-3.9.1\bin/bin

Which is equivalent to:

    export PATH=${PATH}:${MAVEN_HOME}/bin:${M2_HOME}/bin
But you need to have defined M2_HOME first in this case

### Headed
    .launch(new BrowserType.LaunchOptions().setHeadless(false))


### Debug

You need to enable the Play Inspector by setting this variable in Edit Configuration
    
    PWDEBUG = 1

To keep a good visual accessibility:
set your screen to the max resolution and increase font size and scale


[Change desktop screen resolution for Playwright tests](https://www.browserstack.com/docs/automate/playwright/change-screen-resolution)

By default, all Playwright tests on desktop browsers run on a OS level screen resolution of 1920x1080


[How to debug Playwright](https://playwright.dev/java/docs/debug)

