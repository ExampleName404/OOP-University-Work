package Pr8;

class OfflineCourse extends AbstractCourse {
    private String classroom;

    public OfflineCourse(String courseName, int duration, String classroom) {
        super(courseName, duration);
        this.classroom = classroom;
    }

    @Override
    public void startCourse() {
        System.out.println("Оффлайн курс " + courseName + " начался в кабинете " + classroom);
    }

    @Override
    public void endCourse() {
        System.out.println("Оффлайн курс " + courseName + " завершён.");
    }
}