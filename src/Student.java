class Course {
    
    String code;
    String name;

    public Course(String code, String name){
        this.code = code;
        this.name = name;
    }
}
class Module {
    String name;
    String code;

    public Module(String name, String code){
        this.name = name;
        this.code = code;
        
    }
}

public class Student {
    int id;
    String name;
    Course course;
    Module module;

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
        System.out.println("Student ID: " + this.id);
        System.out.println("Their course name is: " + this.course.name);
        System.out.println("Their course ID is: " + this.course.code);
    }




    public static void main (String []args) {

       Course newCour = new Course("COM4023", "Programming Concepts");
       Module newMod = new Module("cghmb", "practice");
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

       Course coding = new Course("CO426", "Web Design");
       Student student = new Student(newCour,newMod);
       student.enroll(coding);
       student.print();

    }


}