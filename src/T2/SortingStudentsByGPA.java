package T2;

import java.util.ArrayList;
import java.util.List;

public class SortingStudentsByGPA{

    public static void Sortr(List<Student> students, int leftBorder, int rightBorder, Comp comp){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = students.get((leftMarker + rightMarker) / 2);
        do {
            while (comp.compare(students.get(leftMarker),pivot)<0) {
                leftMarker++;
            }
            while (comp.compare(students.get(rightMarker),pivot)>0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = students.get(leftMarker);
                    students.set(leftMarker, students.get(rightMarker));
                    students.set(rightMarker, tmp);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            Sortr(students, leftMarker, rightBorder,comp);
        }
        if (leftBorder < rightMarker) {
            Sortr(students, leftBorder, rightMarker,comp);
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Comp comp = new Comp();
        Student Matvey = new Student("Матвей",255);
        Student Vasya = new Student("Вася",285);
        Student Kolya = new Student("Коля",199);
        Student Oleg = new Student("Олег",240);
        Student Tolyan = new Student("Анатолий",230);
        students.add(Matvey);
        students.add(Vasya);
        students.add(Kolya);
        students.add(Oleg);
        students.add(Tolyan);
        System.out.println("Изначальный список:");
        for(int e = 0;e<5;e++){
            System.out.println(students.get(e).toString());
        }
        Sortr(students,0,students.size()-1,comp);
        System.out.println("Сортированный список:");
        for(int e = 0;e<5;e++){
            System.out.println(students.get(e).toString());
        }
    }
}
