## robo-triangle-test

####Requirements: 
1. Create a Micro service to calculate Right Triangle Area.
2. This Micro services returns value  2 decimal precision. 
3. This Micro services should have atleast 5 tests verifying key functionality. 
4. This Micro services should accept requests with unique IDs and respond. 

####Job Done so far:
1. Created TriangleAreaService.java (This will calculate right triangle area given the height & base of triangle. 
And also verifies if the input is less than 8 digits & not negative value.) 
2. Created Junit tests in TriangleAreaTest.java with 5 Junit tests (you can run this by right clicking and executing Run'TriangleAreaTest'.
3. Created Spring Controller to accept request & respond with area value.
4. Created controller test TriangleAreaControllerTest.Java to mock the request & response (This is currently not working as expected, I am
still working on it.)

####How to execute this project:
1. Execute  *git clone https://github.com/balajakka/robo-triangle-test.git* to get project to your IDE.
2. Right click on *TriangleAreaTest* and click *Run'TriangleAreaTest'* to run Junit tests.

####Things expected to be completed by COB today:
1. Fix the controller test to verify service is working.

####Things I could enhance:
1. Write cucumber/Jbehave tests with BDD and glue code to make tests more readable.
2. Create Embedder to run cucumber feature file or Jbehave story file and provde html format report in target.



 
