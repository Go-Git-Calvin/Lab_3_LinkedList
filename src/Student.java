/**
 * Student.java
 *
 * Calvin Wong
 *
 * A Student class
 */

public class Student{
  
  private String name;
  private double gpa;
  
  public Student() {
    
    this.name = "";
    this.gpa = 0.0;
  }

  public Student(String name, double gpa) {
    this.name = name;
    this.gpa = gpa;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public double getGpa() {
    return this.gpa;
  }

  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null) return false;
    if (this.getClass() == obj.getClass()){
      Student other = (Student) obj;
      return this.name.equals(other.getName()) &&
        this.gpa == other.getGpa();
    }
    else {
      return false;
    }
  }

  public String toString() {
    return "Name: " + this.name +" GPA: " + this.gpa;
  }

} // end of class