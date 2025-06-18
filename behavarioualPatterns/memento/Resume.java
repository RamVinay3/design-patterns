package behavarioualPatterns.memento;

import java.util.List;
//Originator
public class Resume {

    private String name;
    private String education;
    private String experience;
     private List<String>skills;


    public void setName(String name) {
        this.name = name;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
   public void printResume(){
    System.out.println("Name: "+this.name);
    System.out.println("education: "+this.education);
    System.out.println("experience "+this.experience);
    for(String skill:skills)
    System.out.println(skill);
    
   }
   public void restore(Memento memento){
        this.name=memento.name;
        this.education=memento.education;
        this.experience=memento.experience;
        this.skills=memento.skills;
   }
   public Memento save(){
    return new Memento(name,education,experience,List.copyOf(skills));
   }
   public class Memento{
    private String name;
    private String education;
    private String experience;
     private List<String>skills;

     public Memento(String name,String education,String experience,List<String>skills){
        this.name=name;
        this.education=education;
        this.experience=experience;
        this.skills=skills;
     }

     public String getName() {
         return name;
     }

     public String getEducation() {
         return education;
     }

     public String getExperience() {
         return experience;
     }

     public List<String> getSkills() {
         return skills;
     }
     

   }
   
    
}
