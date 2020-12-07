public class Student extends Person {


    private String previousOrganization;
    private int skippedDays;

    public Student() {
        super("Jane Doe", 30, "female");
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    @Override
    public void getGoal() {
        getGoalBasic();
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        super.introduceBasic();
        System.out.println(" from " + this.previousOrganization + " who skipped "
                + this.skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays = this.skippedDays + numberOfDays;
    }


}
