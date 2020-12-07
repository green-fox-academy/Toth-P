public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
        this("Jane Doe", 30, "female");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduceBasic() {
        System.out.print("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
    }

    public void introduce() {
        introduceBasic();
        System.out.println(".");
    }

    public void getGoalBasic() {
        System.out.print("My goal is: ");
    }

    public void getGoal() {
        getGoalBasic();
        System.out.println("Live for the moment!");
    }


}
