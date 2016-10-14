# QaAutomation

This is a regression test suite for functional testing.
It contains end to end testing scnearios for ILF, OAP, and TS.
Framework is composed of follwong: Selenium Java, Junit, Java JDK. Requires Selenium Grid implementation to run test in 
other machines or in Sauce lab. Grid defines hub and node for the test and test runs on nodes. 
Test model is page Object Model, each page is a class, each functionality or use case in a given page is a method.
Test class calls methods from various classes inside PageObject package.

#Test Cases:
Test cases can be executed various ways, based on need. I usually execute the test in local first, once thats working
as expected, I execute it in sauce lab, using nodeURL.
