
## Playwright with Java8, gradle and JUnit ##

[Reference](https://lumme.dev/2021/04/15/using-playwright-and-junit.html)

## Organizing ##

1. UI tests:
   1. Check visibility and aspect per page, per type of user.
   2. You will get a total of (#type_of_user x #tiles)
2. Navigation tests
   1. Chose a "complete" user and test navigation to all tiles
3. Functional tests
   1. Create sequence of steps and check its coherency

