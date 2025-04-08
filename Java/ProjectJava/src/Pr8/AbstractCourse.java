package Pr8;

import java.util.HashSet;
import java.util.Set;

abstract class AbstractCourse implements Course {
    protected String courseName;
    protected int duration;
    protected Set<Student> students = new HashSet<>();

    public AbstractCourse(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void printStudents() {
        System.out.println("Список студентов курса " + courseName + ":");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}