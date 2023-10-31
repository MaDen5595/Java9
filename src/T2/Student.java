package T2;

import java.util.Comparator;

public class Student{
    private String name;
    private int gpa;
    public Student(String name, int gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public int getGPA() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(int gpa) {
        this.gpa = gpa;
    }

    public String toString() {return name + " " + gpa;}
}
