/**
 * StudentList.java
 *
 * Calvin Wong
 *
 * A LinkedList with Student Objects
 *
 */

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;

public class StudentList {

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<Student>();

        Scanner scan = new Scanner(System.in);

        prompt();

        int input = scan.nextInt();

        while (input != 8) {

            if (input == 1) {

                System.out.println("Enter the student's first name:");

                String name = scan.next();

                System.out.println("Enter the student's last name:");
                name = name + " " + scan.next();
                System.out.println("Enter the student's GPA (or 0.0 to update later)");
                double gpa = scan.nextDouble();

                students.addFirst(new Student(name, gpa));
            }

            if (input == 2) {

                System.out.println("Enter the student's first name:");
                String name = scan.next();
                System.out.println("Enter the student's last name:");
                name = name + " " + scan.next();
                System.out.println("Enter the student's GPA (or 0.0 to update later)");
                double gpa = scan.nextDouble();

                students.addLast(new Student(name, gpa));
            }

            if (input == 3) {

                System.out.println("Enter the student's first name:");
                String name = scan.next();
                System.out.println("Enter the student's last name:");
                name = name + " " + scan.next();

                ListIterator<Student> iter = students.listIterator();

                while (iter.hasNext()) {
                    if (name.equalsIgnoreCase(iter.next().getName())) {
                        System.out.println(iter.previous().toString());
                        iter.next();
                    }
                }
            }
            if (input == 4) {

                System.out.println("Enter the student's first name:");
                String name = scan.next();
                System.out.println("Enter the student's last name:");
                name = name + " " + scan.next();
                System.out.println("Enter his or her new GPA:");
                double gpa = scan.nextDouble();

                ListIterator<Student> iter = students.listIterator();

                while (iter.hasNext()) {
                    if (name.equalsIgnoreCase(iter.next().getName())) {
                        iter.previous().setGpa(gpa);
                        System.out.println("Confirmed: " + iter.next().toString());
                    }
                }
            }
            if (input == 5) {
                System.out.println("Removing " + students.removeFirst().toString());
            }
            if (input == 6) {
                System.out.println("Removing " + students.removeLast().toString());
            }
            if (input == 7) {
                ListIterator<Student> iter = students.listIterator();
                while (iter.hasNext()) {
                    System.out.println(iter.next().toString());
                }
            }
            prompt();
            input = scan.nextInt();
        }


    }

    public static void prompt() {

        System.out.println("Enter 1 to enter a student at beginning of the list");
        System.out.println("Enter 2 to enter a student at end of the list");
        System.out.println("Enter 3 to print the information for a student");
        System.out.println("Enter 4 to update a student's GPA");
        System.out.println("Enter 5 to remove the first student");
        System.out.println("Enter 6 to remove the last student");
        System.out.println("Enter 7 to print the information of ALL students");
        System.out.println("Enter 8 to end the program");
    }
} // end of class