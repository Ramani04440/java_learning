# Student Report Card

A Java console application that reads a student's details, calculates the total, average and grade, and prints a neatly formatted report card.

## Features

- Reads roll number, name, phone number, section, marks in 3 subjects and attendance using `Scanner`
- Calculates total, average and grade (A, B, C, D or F)
- Checks pass or fail: a student passes only if all three subjects are 40 or above
- Shows whether the roll number is even or odd, and its last digit
- Prints the report card using `printf`
- Shows "Attendance bonus eligible" for students who pass and attended all classes

## Concepts Used

| Concept | Where it is used |
|---|---|
| Data types: `int`, `long`, `double`, `char`, `String`, `boolean` | Storing all student details |
| `final` constant | `PASS_MARK = 40.0` |
| Arithmetic operators `/` and `%` | Average, last digit, even or odd |
| Logical operators `&&`, `\|\|`, `!` | Pass, fail and bonus checks |
| Type casting | `(int) total` |
| `if / else if / else` | Grade calculation |
| Ternary operator | Even or odd label |
| `Scanner` | Reading input, including the `nextLine()` fix after `nextInt()` |
| `printf` | Formatted report output |

## Grading Scale

| Average | Grade |
|---|---|
| 90 and above | A |
| 75 to 89.99 | B |
| 60 to 74.99 | C |
| 40 to 59.99 | D |
| Below 40 | F |

## How to Run

**Requirements:** JDK 8 or above. Check your version:

```bash
java -version
```

**Compile:**

```bash
javac StudentReportCard.java
```

**Run:**

```bash
java StudentReportCard
```

## Sample Input

```text
Enter roll number: 105
Enter name: Arun Kumar
Enter phone number: 9876543210
Enter section: A
Enter marks in 3 subjects: 85.5 92 78
Attended all classes (true/false): true
```

## Sample Output

```text
========== REPORT CARD ==========
Name       : Arun Kumar
Roll No    : 105 (Odd)
Last digit : 5
Phone      : 9876543210
Section    : A
Total      : 255.50
Average    : 85.17
Grade      : B
Result     : Pass
Attendance : true
Attendance bonus eligible
=================================
```

## Project Structure

```text
java-learning-journey/
├── README.md
└── day01-basics/
    ├── StudentReportCard.java
    └── README.md
```

## Author

**RAMANI S**

Learning Java from scratch, one day at a time.
