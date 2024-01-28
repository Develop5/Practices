
## Playwright with Java8, gradle and JUnit ##

[Reference page](https://lumme.dev/2021/04/15/using-playwright-and-junit.html)

## Organizing ##

1. UI tests:
   1. Check visibility and aspect per page, per type of user.
   2. You will get a total of (#type_of_user x #tiles)
2. Navigation tests
   1. Chose a "complete" user and test navigation from all tiles
   2. Navigation from secondary pages
3. Functional tests
   1. Create sequence of steps and check its coherency.
      2. Ex: Open a register, go to main menu and check it exists.

