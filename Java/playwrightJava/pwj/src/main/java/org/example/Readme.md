
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
