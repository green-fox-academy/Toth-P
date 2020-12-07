public class Mentor extends Person {

    private String level;

    public Mentor() {
        super("Jane Doe", 30, "female");
        level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;

    }
    @Override
    public void introduce() {
        super.introduceBasic();
        System.out.println( " " + this.level + ".");
    }

    @Override
    public void getGoal() {
        getGoalBasic();
        System.out.println("Educate brilliant junior software developers.");
    }


}
