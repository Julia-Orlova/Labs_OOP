/*
 * C11 = 0
 * Визначити клас студент, який складається як мінімум з 5-и полів.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class Student {
    //Student[] students = new Student[3];
    //double[] marks = new double[3];
    private int course;
    private String group;
    private String name;
    private String surname;
    private double averageMark;

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student(2, "IV-91", "Andrew", "Frolov", 85.5);
        students[1] = new Student(2, "IV-92", "Michael", "Frolov", 91.5);
        students[2] = new Student(3, "IV-92", "Ivan", "Borisov", 98.0);
        students[3] = new Student(1, "IV-92", "Igor", "Alekseev", 88.98);
        students[4] = new Student(3, "IV-92", "Victor", "Gromov", 78.91);

        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new ComparatorBySurname());
        Arrays.sort(students, Comparator.comparing(Student::getSurname).thenComparing(Student::getName));
        System.out.println("-----------");
        System.out.println("Sorting by surname\n");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new ComparatorBySurname());
        Arrays.sort(students, Comparator.comparing(Student::getSurname).thenComparing(Student::getName).reversed());
        System.out.println("-----------");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new ComparatorByMarks());
        Arrays.sort(students, Comparator.comparing(Student::getAverageMark));
        System.out.println("-----------");
        System.out.println("Sorting by average marks\n");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student(int course, String group, String name, String surname, double averageMark) {
        this.course = course;
        this.group = group;
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getAverageMark() { return averageMark; }

    public String toString() {
        return "Student{" + "course=" + course + ", group='" + group + '\'' + ", name='" + name +
                '\'' + ", surname='" + surname + '\'' + ", averageMark=" + averageMark + '}';
    }
}

class ComparatorBySurname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int differenceSurname = o1.getSurname().compareTo(o2.getSurname());
        if (differenceSurname == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return differenceSurname;
        }
    }
}

class ComparatorByMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int differenceSurname = o1.getAverageMark().compareTo(o2.getAverageMark());
        return differenceSurname;
    }
}
