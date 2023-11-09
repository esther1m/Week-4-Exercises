import java.util.ArrayList;

public class Course {

    
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

