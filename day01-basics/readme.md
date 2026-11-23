```markdown
# Student Report Card

A simple Java console program that reads a student's details, calculates the total, average and grade, and prints a formatted report card.

## Features

- Reads roll number, name, phone number, section, 3 subject marks and attendance using `Scanner`
- Calculates total, average and grade (A, B, C, D, F)
- Checks pass or fail (a student passes only if all subjects are 40 or above)
- Shows whether the roll number is even or odd and its last digit
- Prints the report using `printf`
- Shows an "Attendance bonus eligible" message for students who pass and attend all classes

## Concepts Used

- Data types: `int`, `long`, `double`, `char`, `String`, `boolean`
- `final` constant (`PASS_MARK`)
- Operators: `/`, `%`, `&&`, `||`, `!`
- Type casting: `(int) total`
- `if / else if / else` and the ternary operator
- `Scanner` input (including handling the `nextLine()` issue after `nextInt()`)
- Formatted output with `printf`

## How to Run

1. Make sure Java (JDK 8 or above) is installed. Check with:
   ```
   java -version
   ```
2. Compile the program:
   ```
   javac StudentReportCard.java
   ```
3. Run it:
   ```
   java StudentReportCard
   ```

## Sample Input

```
Enter roll number: 105
Enter name: Arun Kumar
Enter phone number: 9876543210
Enter section: A
Enter marks in 3 subjects: 85.5 92 78
Attended all classes (true/false): true
```

## Sample Output

```
========== REPORT CARD ==========
Name       : Arun Kumar
Roll No    : 105 (Odd)
Last digit : 5
Phone      : 9876543210
Section    : A
Total      : 255.50 (255 as int)
Average    : 85.17
Grade      : B
Result     : Pass
Attendance : true
Attendance bonus eligible
=================================
```

## Grading Scale

| Average | Grade |
|---|---|
| 90 and above | A |
| 75 to 89.99 | B |
| 60 to 74.99 | C |
| 40 to 59.99 | D |
| Below 40 | F |

## Author

RAMANI S
```

