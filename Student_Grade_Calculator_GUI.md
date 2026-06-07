# Student Grade Calculator GUI

A beginner-friendly Java Swing application that calculates a student's average marks, assigns a grade, and determines pass/fail status.

## Features

- Enter student name
- Enter marks for multiple subjects
- Calculate average marks
- Assign grade automatically
- Display pass/fail status
- Simple graphical user interface (GUI)

## Technologies Used

- Java
- Java Swing
- Event Handling

## Concepts Used

- Object-Oriented Programming (OOP)
- Classes and Objects
- GUI Development
- Action Listeners
- Conditional Statements
- Arrays
- Loops

## Project Structure

```text
student-grade-calculator-gui/
│
├── StudentGradeCalculator.java
├── README.md
└── screenshots/
```

## How to Run

### Compile

```bash
javac StudentGradeCalculator.java
```

### Run

```bash
java StudentGradeCalculator
```

## Usage

1. Enter the student's name.
2. Enter marks separated by commas.

Example:

```text
95,88,90,92,85
```

3. Click the **Calculate** button.
4. The application will display:
   - Average Marks
   - Grade
   - Pass/Fail Status

## Grade Criteria

| Average Marks | Grade |
|--------------|--------|
| 90 and above | A+ |
| 80 - 89 | A |
| 70 - 79 | B |
| 60 - 69 | C |
| 50 - 59 | D |
| Below 50 | F |

## Example

### Input

```text
Student Name: Rena

Marks:
95,88,90,92,85
```

### Output

```text
===== RESULT =====

Student Name: Rena
Average Marks: 90.00
Grade: A+
Status: PASS
```

## Future Improvements

- Separate fields for each subject
- Percentage calculation
- Highest and lowest marks
- Reset button
- Improved UI design
- MySQL database integration
- Export results to PDF

## Learning Outcome

This project helped me learn:

- Java Swing GUI development
- Event-driven programming
- User input handling
- Basic software design
- Object-oriented programming concepts

## Author

**Rena Roy V S**

Computer Science Engineering Student

## License

This project is open source and available for learning purposes.