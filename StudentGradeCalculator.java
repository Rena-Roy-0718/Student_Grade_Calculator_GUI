import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGradeCalculator extends JFrame implements ActionListener {

    JLabel nameLabel, marksLabel;
    JTextField nameField, marksField;
    JButton calculateButton;
    JTextArea resultArea;

    public StudentGradeCalculator() {

        setTitle("Student Grade Calculator");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Student Name:");
        nameField = new JTextField(20);

        marksLabel = new JLabel("Enter Marks (comma separated):");
        marksField = new JTextField(20);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        add(nameLabel);
        add(nameField);

        add(marksLabel);
        add(marksField);

        add(calculateButton);

        add(new JScrollPane(resultArea));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String marksText = marksField.getText();

        String[] marksArray = marksText.split(",");

        double total = 0;

        for (String mark : marksArray) {
            total += Double.parseDouble(mark.trim());
        }

        double average = total / marksArray.length;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        String status = average >= 50 ? "PASS" : "FAIL";

        resultArea.setText(
                "===== RESULT =====\n\n" +
                "Student Name: " + name + "\n" +
                "Average Marks: " + String.format("%.2f", average) + "\n" +
                "Grade: " + grade + "\n" +
                "Status: " + status);
    }

    public static void main(String[] args) {
        new StudentGradeCalculator();
    }
}