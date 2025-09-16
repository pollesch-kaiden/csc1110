[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/pjK9QZfH)
# homework6porcaro
CSC1110 Homework 6

# Before you start
1. Read the instructions and watch the video posted in Lab Assignment 6 for using GitHub Classroom to access and submit your program.
1.  Use the Refactor tool in IntelliJ to rename the package currently called username to your MSOE username.
# Complete the following program:
## Write a program that mimics the operations of a vending machine. More specifically, the program reads amounts of money that are inserted into the vending machine, asks the user to select an item, and then prints the change that’s returned to the user.
Use this implementation:
- Use three separate files – `polleschk.VendingMachineDriver` that holds main,  one that holds a `polleschk.VendingMachine` class definition and one that holds `polleschk.ChangeDetails`s which will hold the counts of the individual coins.
- The `polleschk.VendingMachineDriver` is responsible for starting the program and collecting all information from the user.
- The `polleschk.VendingMachine` is the "Business class" for the system and represents the function of the vending machine.  An instance of the `polleschk.VendingMachine` class can be test
### polleschk.VendingMachineDriver
- Replace the TODO comments with the appropriate logic
- This class is intended to drive the program and is responsible for all input from and output to the user
### polleschk.VendingMachine
- Within the `polleschk.VendingMachine` class, include only one variable, `paymentSum`. It holds the sum of money inserted for the current selection. In the interest of encapsulation, use local variables, as opposed to instance variables, whenever possible. Declare a variable locally within a method if the variable needs to persist only for the duration of a particular method call. Declare a variable as an instance variable if the variable needs to persist longer than the duration of a particular method call. For the polleschk.VendingMachine class, the sum of the inserted money is the only thing that needs to persist longer than the duration of a particular method call.
- Within the `polleschk.VendingMachine` class, include these methods:
  - `insertMoney` – This method takes the amount of money that is inserted into the machine. Input validation should happen in the driver and ensures that the user enters a positive number. The entered money amount adds to the accumulated sum of inserted money. 
  - `selectItem` – This method first checks to make sure that some money has been inserted into the machine. If that’s the case, the method prompts the user to enter the selected item’s price. Input validation ensures that the entered price is a positive number and that it is no greater than the accumulated inserted money. Finally, the method calculates and prints a list of the coins that are to be returned to the user as change. You do not need to verify that the input is numeric.
### polleschk.ChangeDetails
- The change details class contains, well, all of the details for any change that is going to be returned from the vending machine.
- Within the polleschk.ChangeDetails class, create one instance variable for each type of coin that will appear in the change: quarters, dimes, nickels and pennies.
  - Create getters and setters for each of those variables.
  - Create a method called printChangeDetails() to print the details of the change amounts stored in the instance.  You can see how this is used in the polleschk.VendingMachineDriver class in the `handleSelectItem()` method.

Try to have your program output match as closely as possible the sample output provided.
Use the driver class in the repository and fill out the TODO areas of the methods

# Sample Output
```
Welcome to John's vending machine!

Options: (i)nsert money, (s)elect an item, (q)uit
Enter i, s, or q ==> d
Invalid selection.
Options: (i)nsert money, (s)elect an item, (q)uit
Enter i, s, or q ==> i
Amount of money inserted: -1
Invalid payment. Must enter a positive number.
Amount of money inserted: 0
Invalid payment. Must enter a positive number.
Amount of money inserted: 2
Options: (i)nsert money, (s)elect an item, (q)uit
Enter i, s, or q ==> s
Select item's price: -1
Invalid price. Must enter a positive number.
Select item's price: 0
Invalid price. Must enter a positive number.
Select item's price: .32
Your change
===========
6 quarter(s)
1 dime(s)
1 nickel(s)
3 penny(ies)

Options: (i)nsert money, (s)elect an item, (q)uit
Enter i, s, or q ==> i
Amount of money inserted: 12.43
Options: (i)nsert money, (s)elect an item, (q)uit
Enter i, s, or q ==> s
Select item's price: 8.74
Your change
===========
14 quarter(s)
1 dime(s)
1 nickel(s)
4 penny(ies)

Options: (i)nsert money, (s)elect an item, (q)uit
Enter i, s, or q ==> q
```

# Submission Instructions:
[Commit and Push](https://taylorial.com/tools/githubclassroom/) your code to GitHub Classroom.

