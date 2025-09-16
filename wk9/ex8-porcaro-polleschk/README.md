[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/-T1iCQuE)
# CSC1110 Exercise 8

### Arrays vs ArrayLists

Arrays are the foundation for many collections in object oriented languages. Some collections, like the `ArrayList`, even use an array itself to store its data. But even with convenient classes like `ArrayList`s there are still many uses for arrays in modern programming. Arrays generally use very little memory compared to ArrayLists and can often be faster to retrieve data from. They also tend to use simpler syntax when you need multiple dimensions. Take, for example, a 2D array of integers vs a 2D `ArrayList` of integers:

```java
int[][] arr = new int[5][5];
ArrayList<ArrayList<Integer>> list = new ArrayList();
```

Both represent a collection of collections. The first is an array of arrays of `int` variables. The second is a list of lists of `Integer` objects. To access the third element of the second collection would look like this:

```java
int x = arr[1][2];
int y = list.get(1).get(2);
```

Remember, everything is zero-indexed, so the index values are 1 and 2, not 2 and 3. Also, the first dimension is which of the collections we are looking in, so we first have to access the second collection (index 1) and then access the value in that collection (index 2).

### Useful `ArrayList` Methods

One of the chief benefits of using `ArrayList`s are the prebuilt methods that we can use. Arrays are not normal objects and do not have any methods. They have a single instance variable, `length`, that only tells you how many indexes are in the array. `ArrayList`s have methods that can do a variety of tasks ranging from simple to complex, and have additional information, such as the number of elements currently in the `ArrayList`. An `ArrayList` serves as a "wrapper class" to the array, in much the same way the `Integer` class does with an int, giving it methods and additional functionality. 

You will write the following methods for an array, then do the same thing with an `ArrayList` to check your work. Use the `ArrayList` documentation to find the specifics of the methods. 

* Return the fifth element from the array/`ArrayList`.
* Find the index of the last instance of the value *6* in the array/`ArrayList`.
* Remove the third element from the array/`ArrayList` and shift the later elements left, so there is no gap between elements. Return the element removed.
    * For example, if the array were [5, 8, 2, 5, 1, 9], removing the third element would result in the [5, 8, 5, 1, 9].
* Add the value *9* at index 0, shifting all of the existing elements to the right to make room for the new element.

### Sample Output
<pre>
ARR: [4, 8, 1, 3, 5, 6, 3, 6, 2, 6, 7]

ARR: 5
LIST: 5
ARR: 9
LIST: 9
Removed from arr: 1
ARR: [4, 8, 3, 5, 6, 3, 6, 2, 6, 7]
Removed from List: 1
LIST: [4, 8, 3, 5, 6, 3, 6, 2, 6, 7]
ARR: [9, 4, 8, 3, 5, 6, 3, 6, 2, 6, 7]
LIST: [9, 4, 8, 3, 5, 6, 3, 6, 2, 6, 7]
</pre>

#### Submission Instructions

[Commit and Push](https://taylorial.com/tools/githubclassroom/) your files to GitHub Classroom.
