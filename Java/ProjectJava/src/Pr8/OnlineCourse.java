package Pr8;

class OnlineCourse extends AbstractCourse {
    private String platform;

    public OnlineCourse(String courseName, int duration, String platform) {
        super(courseName, duration);
        this.platform = platform;
    }

    @Override
    public void startCourse() {
        System.out.println("Онлайн курс " + courseName + " начался на платформе " + platform);
    }

    @Override
    public void endCourse() {
        System.out.println("Онлайн курс " + courseName + " завершён.");
    }
}
