package Pr5;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Abdu", "Rakhman", "CS101", 85),                        // Обычный студент
                new Student("Put", "In", "CS102", 95),                              // Студент с высокой оценкой
                new Aspirant("Ukra", "Ine", "CS103", 88, true)  ,   // Аспирант без высокой оценки
                new Aspirant("Rus", "Sia", "CS104", 92, true)       // Аспирант с высокой оценкой
        };

        // Вызов метода getScholarship() для каждого элемента массива
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + ": " + student.getScholarship() + " тг");
        }
    }
}
