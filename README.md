# QaAutomation

This is a regression test suite for functional testing.
It contacins end to end testing scnearios fro ILF, OAP, and TS.
Framework is composed of follwong: Selenium Java, Junit, Java JDK. Requires Selenium Grid implementation to run test in 
other machines or in Sauce lab. Grid defines hub and node fro the test and test run on nodes. 
Test model is page Object Model, each page is a class, each functionality or use case is a method.
Test class calls methods from various classes inside PageObject package.

#Test Cases:
Test cases can be executed various ways, based on need. I usually execute the test in local first, once thats working
as expected, I execute in sauce lab, using nodeURL.
