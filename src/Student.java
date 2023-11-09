import java.util.ArrayList;

class Course {
    
    String code;
    String name;
    ArrayList <Module> modules = new ArrayList <Module>();
    Module module;

    public Course(String code, String name, Module module){
        this.code = code;
        this.name = name;
        this.module = module;

        Module programmingConcepts = new Module ("Programming concepts", "COM4023");
        Module networking = new Module ("Networking", "CO426");
        Module security = new Module ("Security", "CO678");
        Module cloudComp = new Module ("Cloud Computing", "CO234");

        modules.add (programmingConcepts);
        modules.add(networking);
        modules.add(security);
        modules.add(cloudComp);

    }
    public ArrayList get (){
        return modules;
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