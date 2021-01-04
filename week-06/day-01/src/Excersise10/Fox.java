package Excersise10;

public class Fox {

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    String name;
    String color;
    Integer age;

    public Fox(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
