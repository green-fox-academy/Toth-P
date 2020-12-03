package Classroom;

public class TeacherStudent {
        //    Instantiate a Student and Teacher object
        //    Call the student's question() method and the teacher's teach() method


    public static void main(String[] args) {
        Student student1 = new Student();

        student1.learn();

        Teacher teacher = new Teacher();

        teacher.answer();

        teacher.teach(student1);
        student1.question(teacher);
    }
}


