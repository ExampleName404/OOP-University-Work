package Pr5;

class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    Student() {
        this.firstName = "No First Name";
        this.lastName = "No Last Name";
        this.group = "No Group Name";
        this.averageMark = 0;
    }

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    // Метод не требует параметра, использует внутреннее поле averageMark
    double getScholarship() {
        if (averageMark >= 90) {
            return 25000;
        } else {
            return 20000;
        }
    }
}

class Aspirant extends Student {
    boolean hasScientificWork;

    Aspirant(String firstName, String lastName, String group, double averageMark, boolean hasScientificWork) {
        super(firstName, lastName, group, averageMark);
        this.hasScientificWork = hasScientificWork;
    }

    @Override
    double getScholarship() {
        if (averageMark >= 90) {
            return 200000;
        } else {
            return 150000;
        }
    }
}
