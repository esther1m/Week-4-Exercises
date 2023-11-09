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




    public static void main (String []args) {
       
       Module newMod = new Module("cghmb", "practice");
       Course newCour = new Course("COM4023", "Programming Concepts", newMod);
       System.out.println(newCour.code);
       System.out.println(newCour.name);

       Student newStud = new Student(newCour, newMod);
       System.out.println (newStud.id);
       System.out.println (newStud.name);

       Student stude = new Student(newCour,newMod);
       stude.id = 67;
       stude.name = "Kylie";

       System.out.println (stude.id);
       System.out.println (stude.name);
       System.out.println (stude.course.code);

       newCour.code = "CO456";
       newCour.name = "Networking";
       stude.enroll(newCour);
       System.out.println(stude.course.code);
       System.out.println (stude.course.name);

       stude.print();

       Course coding = new Course("CO426", "Web Design", newMod);
       Student student = new Student(newCour,newMod);
       student.enroll(coding);
       student.print();

    }


}