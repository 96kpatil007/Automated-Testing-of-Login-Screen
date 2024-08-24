# Automated-Testing-of-Login-Screen
Assumptions

The login page is located at https://www.germany-is-calling.com/login.
The valid credentials are valid@email.com and validPassword.
The invalid credentials are invalid@email.com and invalidPassword.
The error message for invalid credentials is Invalid email or password.


Additional Information

The test scripts use ChromeDriver to interact with the web application.
The test scripts assume that the login page has an email input field, a password input field, and a submit button
The test scripts assume that the error message for invalid credentials is displayed in a div element with a class of error-message.
The test report will include the results of both the successful and unsuccessful login tests, including any failures or errors encountered.
The test scripts can be improved by adding more test cases to cover different scenarios, such as testing with different types of invalid credentials.

Test Execution Steps

Clone the repository and navigate to the project directory.
Install the required dependencies by running mvn clean install.
Run the test suite by executing mvn test.
The test report will be generated in the target/surefire-reports directory.
