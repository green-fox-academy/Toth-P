package Classroom;

public class Student {
//    learn() -> prints the student is learning something new
//    question(teacher) -> calls the teachers answer method

    public Student() {

    }

    public void learn() {

        System.out.println("The student is learning something new.");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
