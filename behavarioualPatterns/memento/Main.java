package behavarioualPatterns.memento;

import java.util.Arrays;

public class Main {
    public static void main(){
        Resume resume=new Resume();
        ResumeHistory history=new ResumeHistory();
        resume.setName("Vinay");
        resume.setExperience("2 years in cpp");
        resume.setSkills(Arrays.asList("CPP","DSA","UI/UX"));
        history.save(resume);
        resume.setExperience("Working in TCS company");
        resume.printResume();//shows updated 

        history.undo(resume);
        resume.printResume();//shows intial state.


    }
}
