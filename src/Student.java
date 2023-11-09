import java.util.ArrayList;

public class Student {
    int id;
    String name;
    Course course;
    Module module;
    ArrayList <Module> modules;
    public Student(Course courses, Module modules) {
        id = 65;
        name = "Esther";
        this.course = courses;
        this.module = modules;
    }

    public void enroll (Course courses) {
        this.course = courses;
    }
    public void print() {

       // this.student = student;
        System.out.println("Their name is " + this.name);
        System.out.println("Student ID: " + this.id);
        System.out.println("Their course name is: " + this.course.name);
        System.out.println("Their course ID is: " + this.course.code);
        for (int count = 0; count< modules.size(); count++){
            System.out.println("Their modules are "+ modules.get(count));
        }
       
    }

    }