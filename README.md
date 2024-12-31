# Java Frameworks D287

I completed this project during my 4th semester at WGU as a part of the class, Java Frameworks D287. 

For the complete project requirements, please refer to the "Task Overview" pdf file.  Additional project details can be found in these files: Shop Inventory Management User Guide.pdf, UML diagram.png, and Products and Parts.jpg.  The file “Products and Parts” was created by me for my project idea while the other files were provided by the course instructor.

Below is the README file submitted with my course project, which describes the code changes for parts C-J from the project requirements.






<strong>
Student Name: JESSICA NICHOLS<br>
Student ID: 010500487<br>
WESTERN GOVERNOR'S UNIVERSITY<br>
Course: D287 – JAVA FRAMEWORKS<br>
Assignment: ALN2 TASK 1: WEB-BASED SPRINT INVENTORY APPLICATION<br>
</strong><br>


<strong>PART B</strong>

<strong>Prompt: Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.</strong>

This document is the README file for Part B.

<strong>PART C</strong>

<strong>Prompt: Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
<br>
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.</strong>

File Name: mainscreen.html<br>
Line Number(s): 14, 19<br>
Description of Changes: Customize the HTML user Interface for Green Country Dog Houses<br>

File Name: mainscreen.html<br>
Line Number(s): 21-55<br>
Description of Changes: Later I went back and added the products and parts to mainscreen.html and moved the about button to the top of the page.  (This was after I completed part E).<br>

<strong>PART D</strong>

<strong>Prompt: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.</strong>

File Name: about.html<br>
Line Number(s): All<br>
Description of Changes: Created about HTML page to give consumers more information about Green Country Dog Houses<br>

File Name: AboutController.java<br>
Line Number(s): All<br>
Description of Changes: Created About Controller to map http://localhost:8080/about to the about.html template.<br>

File Name: mainscreen.html<br>
Line Number(s): 44-46 >> later moved to 22-25<br>
Description of Changes: Added a navigation button that navigates to about.html.<br>

File Name: about.html<br>
Line Number(s): 90-92<br>
Description of Changes: Added a navigation button that navigates back to mainscreen.html.<br>

<strong>PART E</strong>

<strong>Prompt: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.  

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.</strong><br>

File Name: BootStrapData.java<br>
Line Number(s): 72-184<br>
Description of Changes:  Added inhouse parts, outsourced parts, and products and stored them in the repositories.  Also, an if statement was added to check to see if the part and product lists are empty before adding the sample inventory.<br>

<strong>PART F</strong>

<strong>Prompt: Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:</strong><br>
<strong><br>
•  The “Buy Now” button must be next to the buttons that update and delete products.<br>
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.<br>
•  Display a message that indicates the success or failure of a purchase.<br>
</strong>

File Name: mainscreen.html<br>
Line Number(s): 120-121<br>
Description of Changes:  Added a "Buy Now" button to the products table.  Mapped the button from /mainscreen to /buyProduct and the BuyProductController.<br>

File Name: BuyProductController.java<br>
Line Number(s): all<br>
Description of Changes:  Created the BuyNowProduct Controller.   This controller check to see if the product is in stock and returns a success or an error message (2 new html templates).  If the product is in stock, the inventory count is decreased by one.<br>

File Name: buyNowFailure.html<br>
Line Number(s): all<br>
Description of Changes:  If the selected product is out of stock this page is displayed to communicate a failure to purchase.<br>

File Name: buyNowSuccess.html<br>
Line Number(s): all<br>
Description of Changes:  If the selected product is in stock this page is displayed to communicate a successful purchase.<br>

<strong>PART G</strong>

<strong>Prompt:Modify the parts to track maximum and minimum inventory by doing the following:</strong><br>
<strong><br>
•  Add additional fields to the part entity for maximum and minimum inventory.<br>
•  Modify the sample inventory to include the maximum and minimum fields.<br>
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.<br>
•  Rename the file the persistent storage is saved to.<br>
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.</strong><br>

File Name:Part.java<br>
Line Number(s): 32-37 <br>
Description of Changes: Added fields minInv and maxInv.  Used @Min and @Max to validate.<br>

File Name:Part.java<br>
Line Number(s): 53-60 <br>
Description of Changes: Added overloaded constructor with  minInv and maxInv.<br>

File Name:Part.java<br>
Line Number(s): 94-103 <br>
Description of Changes: Added getters and setters setMinInv, getMinInv, setMaxInv, getMaxInv.<br>

File Name:BootStrapData.java<br>
Line Number(s): 81-82, 89-90, 97-98, 105-106, 113-114, 121-122, 129-130147-148, 156-157, 165-166, 174-175, 183-184 <br>
Description of Changes: Modified the sample inventory to include the maximum and minimum fields.<br>

File Name:InhousePartForm.html<br>
Line Number(s): 24-26<br>
Description of Changes: Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.<br>

File Name:OutsourcedPartForm.html<br>
Line Number(s): 25-27<br>
Description of Changes: Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.<br>

File Name:application.properties<br>
Line Number(s): 6<br>
Description of Changes: Renamed the file the persistent storage is saved to.  Changed the data source file name to GCDogHousesDB.<br>

File Name: Part.java<br>
Line Number(s): 113-118<br>
Description of Changes: Created invIsValid method.  This method determines if inventory value is within minInv and maxInv limits.<br>

File Name: AddInhousePartController.java<br>
Line Number(s): 43-45<br>
Description of Changes: Added an if statement within submitForm that utlizies invIsValid method to check if inventory is within limits.  If invIsValid is false, and error message is generated.<br>

File Name: AddOutsourcedPartController.java<br>
Line Number(s): 44-55<br>
Description of Changes: Added an if statement within submitForm that utlizies invIsValid method to check if inventory is within limits.  If invIsValid is false, and error message is generated.<br>

File Name: mainscreen.html<br>
Line Number(s): 73-74, 83-84<br>
Description of Changes: Added maximum and minimum inventory to parts table on mainscreen.html.<br>

<strong>PART H</strong>

<strong>Prompt:Add validation for between or at the maximum and minimum fields. The validation must include the following:</strong><br>
<strong><br>
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.<br>
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.<br>
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.</strong><br>

File Name: Part.java<br>
Line Number: 120-132<br>
Description of change: Added methods invAtMinimum and invAtMaximum.<br>

File Name: EnufPartsValidator.java<br>
Line Number: 36-37<br>
Description of change: Modified the if statement to return false if changing the product inventory would drop associated parts inventory below minimum limit.<br>

File Name: ValidEnufParts.java<br>
Line Number: 20<br>
Description of change: Edited error message to include the case that changing the product inventory would drop associated parts inventory below minimum limit.<br>

<strong>PART I</strong>

<strong>Prompt:Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.</strong>

File Name: PartTest.java<br>
Line Number: 105-121 <br>
Description of change: Added unit tests maxLimitTest and minLimitTest.  Both tests passed when run.<br>

File Name: pom.xml<br>
Line Number: 53-56 <br>
Description of change: Updated junit dependecy info.<br>

<strong>PART J</strong>

<strong>Prompt:Remove the class files for any unused validators in order to clean your code.</strong>

File Name: DeletePartsValidator.java<br>
Description of change: Deleted this class file.  Using Code > Inspect Code in IntelliJ, I found and deleted the 1 unused validator.<br>

<strong>PART K</strong>

<strong>Prompt:Demonstrate professional communication in the content and presentation of your submission.</strong>

..............
<strong>PART A</strong>

<strong>Prompt:Create your subgroup and project by logging into GitLab using the web link provided and using the “GitLab How-To” web link, and do the following:</strong><br>
<strong><br>
•  Clone the project to the IDE.<br>
•  Commit with a message and push when you complete each of the tasks listed below (e.g., parts C to J).<br>
<br>
Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.<br>
<br>
•  Submit a copy of the Git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.
<br>
<br>
Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.</strong>

