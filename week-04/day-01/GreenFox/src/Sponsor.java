public class Sponsor extends Person {


    private String company;
    private int hiredStudents = 0;

    public Sponsor() {
        super("Jane Doe", 30, "female");
        company = "";
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    @Override
    public void introduce() {
        super.introduceBasic();
        System.out.println(" who represents " + this.company +
                " and hired " + this.hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        getGoalBasic();
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire() {
        this.hiredStudents++;
    }


}


