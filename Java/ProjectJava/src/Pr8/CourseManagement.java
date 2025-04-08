package Pr8;

public class CourseManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Алексей", 1);
        Student s2 = new Student("Мария", 2);
        Student s3 = new Student("Алексей", 1); // Дубликат

        OnlineCourse javaCourse = new OnlineCourse("Java", 8, "Zoom");
        javaCourse.addStudent(s1);
        javaCourse.addStudent(s2);
        javaCourse.addStudent(s3); // Не добавится повторно

        javaCourse.startCourse();
        javaCourse.printStudents();
        javaCourse.endCourse();
    }
}

