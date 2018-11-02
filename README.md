# Simple automation test

- Test automation project developed in Selenium 3;
- Implemented in JAVA v7;
- Uses MAVEN as a dependency manager;
- Uses Appium for mobile mobile devices;
- Has support in the execution of test cases with the TestNG framework;
- Uses the standard of PageObjects projects;
- It has support for execution on mobile devices;
- Run on test in the cloud via SauceLabs;

#Install a project:

- Clone the project.
- Open the project using Eclipse (IDE)
- Install the TestNG plugin in Eclipse.
  - Accessing Eclipse in the menu "help / Eclipse Marktplace"
  - Search for "TestNG"
  - Install the "TestNG for Eclipse"
  - Close and open Eclipse
- Install as dependencies of Maven
  - Right click on the file "pom.xml"
  - Click on "Run As - Maven Install"

#Run the test:

- Open the project via Eclipse;
- Right click on the file "functionalTest.xml" and select "Run as TestNG";
- The execution will be carried out in device in the cloud via Sauce Labs;
- Images of test evidence in: MobileAutomationSimpleTest/test-output/evidences/
