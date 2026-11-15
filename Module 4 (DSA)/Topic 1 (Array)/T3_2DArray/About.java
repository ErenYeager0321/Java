package T3_2DArray;
/*
What Exactly is a 2D Array?
Standard Definition:
A 2D array is an array of arrays. It consists of multiple rows, with each 
row being an array. This allows us to represent data in a tabular or matrix 
form. In a 2D array, data is stored in both rows and columns, and each 
element is accessed using two indices: one for the row and one for the column.

Simple Explanation:
Think of a 2D array as a spreadsheet or a matrix. Imagine you have a table with rows and columns:
Subject 1 | Subject 2 | Subject 3
Student 1 | 85 | 90 | 78
Student 2 | 88 | 92 | 84
Student 3 | 75 | 80 | 70
Here, each cell represents a piece of data (marks) stored at the intersection of a row (representing a student) and a column (representing a subject).
In Java, this is equivalent to a 2D array where:
* Rows represent the students.
* Columns represent the subjects.
Each student's marks for each subject can be stored in the corresponding row and column.

Why Are 2D Arrays Important?
2D arrays are very useful when you work with data that's naturally organized in rows and columns. Here's why they are important:
* Organized Storage: They help you store data in a neat grid, making it easier to manage complex information, like a list of student marks or a table of sales data.
* Access Multiple Dimensions: 2D arrays allow you to work with data in two directions-rows and columns. This makes them perfect for tasks like organizing seating arrangements, managing game boards, or tracking grades for students.
* Flexible Operations: With 2D arrays, you can work with multiple sets of data at once. For example, you can easily calculate the total marks of each student or find the highest and lowest scores in a subject.

First, we declare a 2D array. A 2D array is essentially an array of arrays, so you'll specify the number of rows and columns.
Syntax:
dataType[][] arrayName = new dataType[rows][columns];

Example:
int[][] marks = new int[3][4]; // 3 students, 4 subjects
This creates a 2D array marks where:
• There are 3 rows (representing students).
• There are 4 columns (representing subjects).

Step 2: Initializing a 2D Array with Values
You can initialize a 2D array at the time of declaration by providing values in a nested structure.
Example: Direct Initialzation
int[][] marks = {
(85, 90, 78, 88), // Student 1's marks
(92, 84, 91), // Student 2's marks
(75, 80, 85) // Student 3's marks
};
This creates a 2D array with predefined values for 3 students and 4 subjects.

Step 2: Accessing Array Elements
To access elements in a 2D array, we use two indices-one for the row and one for the column. For example, if you want to access the mark of Student 1 in Subject 2, you would do:

int mark = marks[0][1]; // Accessing Student 1's Subject 2 mark
Remember, in Java, array indices start at 0, so marks[0][1] refers to the first student (Student 1) and the second subject (Subject 2).

Step 3: Printing 2D Array Values
To print the entire 2D array, you can use nested loops-one loop for the rows and one for the columns:

for (int i = 0; i < marks.length; i++) {
	for (int j = 0; j < marks[i].length; j++) {
	System.out.print(marks[i][j] + " ");
	}
	System.out.println(); // Move to the next line after each row
}

This loop will print the 2D array row by row.

Key Points to Remember:
• Array Size: A 2D array has both rows and columns. You need to specify both when declaring it.
• Accessing Elements: Use two indices to access elements-one for the row and one for the column.
• Nested Loops: Use nested loops (one for rows and one for columns) to traverse and print the array.
• Fixed Size: The size of a 2D array is fixed once initialized. If you need a larger array, you'll have to create a new one.

*/
public class About {

}
