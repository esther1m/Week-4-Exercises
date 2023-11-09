public class App {
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
