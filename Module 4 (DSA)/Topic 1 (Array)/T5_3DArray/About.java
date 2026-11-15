package T5_3DArray;
/*
Standard Definition:
A 3D array is a data structure in which the elements are organized in three dimensions—rows, columns, and depth (layers). You can think of it as a collection of 2D arrays, each
representing a "slice" of the 3D array.

Simple Explanation:
A 3D array is an array of arrays. It's like a cube or a stack of grids, where each "grid" is a 2D array. You use three indices (three numbers) to access an element—one for the
layer (depth), one for the row, and one for the column.

Imagine a bookshelf with several layers. Each layer has rows, and each row has books in columns. To find a specific book, you need three pieces of information: which layer the book is
on, which row the book is in, and which column the book is placed in.

Why Are 3D Arrays Important?
3D arrays are helpful when you need to organize and manage data that has three dimensions. They allow you to store data in a way that would be difficult or inefficient with simpler
arrays.

Here are some examples where 3D arrays are useful:
• Games: Storing a 3D game world where the three dimensions could represent position in space (like x, y, and z coordinates).
• Medical Imaging: Storing 3D images, where each point in the image is represented by three values (such as height, width, and depth).
• Time-series data: Storing data over time for multiple things, like tracking sales for different stores and products over multiple years.
Creating and Working with 3D Arrays in Java

Step 1: Declaring and Initializing a 3D Array
To declare a 3D array, we specify the number of layers, rows, and columns.

Syntax:
dataType[][][] arrayName = new dataType[layers][rows][columns];

For example:
int[][][] salesData = new int[3][4][5];

This creates a 3D array called salesData where:
• 3 layers represent different stores;
• 4 rows represent different departments in each store, and
• 5 columns represent different days in the week for each department.

Step 2: Assigning Values to a 3D Array
Once we've declared the 3D array, we can assign values to each element using three indices.
Example:
salesData[0][0][0] = 100; // Store 1, Department 1, Day 1
salesData[0][1][0] = 120; // Store 1, Department 1, Day 2
salesData[1][2][4] = 200; // Store 2, Department 3, Day 5

Each element in the array is accessed using three indices: one for the layer (store), one for the row (department), and one for the column (day).
Step 3: Accessing Values in a 3D Array
To access a specific value in a 3D array, you need to provide three indices: one for the layer, one for the row, and one for the column.
Example:
int sales = salesData[0][0][1]; // Accessing the sales for Store 1, Department 1, Day 2
System.out.println(sales); // This will print 120

Step 4: Printing a 3D Array
To print a 3D array, we can use nested loops. We need a loop for the layers, a loop for the rows, and another for the columns.
Example:
for (int i = 0; i < salesData.length; i++) {
	for (int j = 0; j < salesData[i].length; j++) {
		for (int k = 0; k < salesData[i][j].length; k++) {
		System.out.print(salesData[i][j][k] + " ");
		}
		System.out.println(); // Move to the next line after each row
	}
	System.out.println(); // Move to the next layer
}

This will print all the values in the 3D array layer by layer.

Key Points to Remember:
* 3D Array: It's an array of arrays of arrays. Use it when you need to store and manage data with three dimensions.
* Layer, Row, Column: The first index refers to the layer (depth), the second refers to the row, and the third refers to the column.
* Nested Loops: Use nested loops to access or print values in a 3D array-one loop for each dimension (layers, rows, columns).
* Fixed Size: The size of a 3D array is fixed once it is initialized. If you need more space, you must create a new array.

Real World Usage of 3D Arrays:
* 3D Video Games: Storing and managing a game world made of blocks or objects in 3D space (like in Minecraft).
* Medical Imaging (MRI, CT Scans): Storing images from a 3D scan, where each slice shows a 2D picture of the body.
* Weather Forecasting: Tracking weather data (like temperature and humidity) in 3D across different places and times.
* Robotics Path Planning: Helping robots navigate and avoid obstacles by mapping the environment in 3D.
* 3D Image Processing (RGB Values): Storing colors of images in a 3D format, with each pixel having a red, green, and blue value.

*/
public class About {
	
}
