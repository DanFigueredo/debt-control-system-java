# debt-control-system-java

A simple console-based debt management system developed in Java.

This project was created to practice programming fundamentals such as arrays, loops, methods, conditional structures, and CRUD logic while building a real-world application.

---

# Technologies Used

- Java
- IntelliJ IDEA
- Git & GitHub

---

# Features

## Add Debt
Allows the user to register a new debt by entering:

- Debt name
- Debt value
- Days left until due date

Example:

What is the name of the debt?
Internet

What is the value of the debt?
120

How many days are left until the due date?
5

---

## List Debts
Displays all registered debts with their information:

- Debt number
- Name
- Value
- Days left
- Payment status

Example:

Debt 1
Name: Internet
Value: 120.0
Days Left: 5
Status: Pending

---

## Mark Debt as Paid
Allows the user to mark a debt as paid using its number.

Example:

Which debt do you want to mark as paid?
1

After updating:

Status: Paid

---

## Remove Debt
Removes a debt from the system.

The program reorganizes the arrays automatically after deletion to avoid empty positions.

Example:

Which debt do you want to delete?
2

---

## Show Total Debts
Calculates and displays the total value of all registered debts.

Example:

Total debts: 2350.0

---

# Concepts Practiced

This project was developed to practice:

- Arrays
- Loops (`for`, `while`)
- Conditional structures (`if/else`)
- Methods and parameters
- CRUD operations
- Data organization
- Input handling with `Scanner`
- Separation of responsibilities

---

# Project Structure

src/
└── projects/
    └── debtcontrol/
        ├── DebtSystem.java
        └── DebtService.java

---

# Future Improvements

Planned future features:

- Use of Object-Oriented Programming (OOP)
- Replace arrays with `ArrayList`
- Save debts in files or database
- Add login system
- Send email notifications before due dates
- Build a graphical interface
- Create REST API with Spring Boot

---

# Author

Daniel Figueredo Saraiva Arruda

GitHub:
https://github.com/DanFigueredo
