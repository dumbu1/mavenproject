Feature: feature1
Scenario Outline: scenario1

Given user is on "Web Examples - CrossBrowserTesting.com" page
When user clicks on "Selenium Example Page" link
Then system should display "Selenium Test Example Page" page


When user enters "<names1>" on form elements text box
And user enters "<names2>" on form elements text area
And user clicks on "Submit" button
Then system should display "Selenium Test Example Page" page

Examples:
|names1|names2|
|mohan|raghu|
|krishna|kiran|
|Satya|sree|