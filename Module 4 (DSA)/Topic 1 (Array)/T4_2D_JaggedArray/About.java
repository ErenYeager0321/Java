package T4_2D_JaggedArray;
/*
Standard Definition
A jagged array is an array of arrays, where each element of the outer array is itself an array, and these inner arrays can have different lengths. It's different from a 2D array, where all rows must have the same number of columns.

Simple Explanation:
Think of a jagged array as a set of boxes. Some boxes may hold 3 items, others 5, and others 7, depending on the need. Each box (inner array) can store a different number of items, making jagged arrays more flexible and space-efficient than regular 2D arrays, where every box must hold the same number of items.

Why are Jagged Arrays Important?
Jagged arrays are very useful in scenarios where the data structure is not uniform across rows, such as:

1. Efficient Memory Usage: They only allocate memory for the data that's actually stored, reducing wasted space.
2. Flexibility: They are perfect when the number of elements varies from row to row, such as when handling varying lengths of data or lists.
3. Representing Irregular Data: They are ideal for storing all data that doesn't need to be neatly into a rectangular 2D structure.

Step 1: Reviewing a Jagged Array
A jagged array is declared as an array of arrays, and the use of each inner array is defined later.

System:
int[][] JaggedArray = new int[3][]; // Declares a jagged array with 3 rows.

Pre-example:
JaggedArray[0] = new int[5]; // Row 0 will have 5 columns, but the number of columns are defined later.

Step 2: Initializing a Jagged Array
Once declared, you can initialize each row (array) with a different number of elements.

Example:
int[][] JaggedArray = new int[3][]; // First row with 3 columns
JaggedArray[0] = new int[4]; // Second row with 2 columns
JaggedArray[1] = new int[3]; // Third row with 3 columns
JaggedArray[2] = new int[2];

Now, you have a jagged array with 3 rows, where:
The first row has 4 elements.
The second row has 3 elements.
The third row has 2 elements.

Step 3: Assigning Values to the Jagged Array
After declaring and initializing the jagged array, you can assign values to each element.

Example:
JaggedArray[0][0] = 10;
JaggedArray[0][1] = 20;
JaggedArray[0][2] = 30;
JaggedArray[0][3] = 40;

JaggedArray[1][0] = 50;
JaggedArray[1][1] = 60;
JaggedArray[1][2] = 70;

JaggedArray[2][0] = 80;
JaggedArray[2][1] = 90;

Here, we've assigned values to each element in the jagged array.

Step 4: Accessing Elements in a Jagged Array
To access elements in a jagged array, you use two indices: one for the row and one for the column.

Example:
int value = JaggedArray[0][1]; // Accessing the 2nd element in the 1st row
System.out.println(value); // This will print 20

Step 5: Printing the Jagged Array
To print a jagged array, you can use nested loops. The outer loop will iterate through the rows, and the inner loop will iterate through each element in the row.

Example:
for (int i = 0; i < JaggedArray.length; i++) {
for (int j = 0; j < JaggedArray[i].length; j++) {
System.out.print(JaggedArray[i][j] + " ");
}
System.out.println();
}

This will print all the values contained in the jagged array, one row by one.

Key Points to Remember:
* Jagged Arrays: Arrays of arrays where the size of each row (sub-array) can be different.
* Declaration: You declare the outer array first, then initialize each inner array separately.
* Array Initialization: You can initialize each inner array with different sizes.
* Declaration: First, decide the number of rows, then, each row can be dynamically initialized with different column sizes.
* Accessing Elements: Use two indices to access or print each element of a jagged array.

Key Points to Remember:
* Jagged Arrays: Arrays of arrays where the size of each row (sub-array) can be different.
* Declaration: You declare the outer array first, then initialize each inner array separately.
* Array Initialization: You can initialize each inner array with different sizes.
* Declaration: First, decide the number of rows, then, each row can be dynamically initialized with different column sizes.
* Accessing Elements: Use two indices to access or print each element of a jagged array.

Real World Examples of Jagged Arrays
* Employee Records: Each employee might have different information, like name, contact, and skills. For example:
* Employee 1: ["John", "john@example.com", "Manager"]
* Employee 2: ["Jane", "jane@example.com", "Developer"]
* Student Scores: Different students might have taken different numbers of tests.
* Student 1: [80, 90, 75]
* Student 2: [95, 88]
* Survey Responses: Delivered survey respondents can answer a different number of questions.
* Respondent 1: ["Yes", "No", "Maybe"]
* Respondent 2: ["Yes", "No"]
* Respondent 3: ["Yes", "Yes", "No", "Maybe"]
* Note: Not all respondents answered all questions.
*/
public class About {

}
