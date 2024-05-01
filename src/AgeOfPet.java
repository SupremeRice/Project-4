import java.util.ArrayList;

public class AgeOfPet extends KindOfPet{
    private Integer Age;

    public AgeOfPet(String TypeOfPet, String KindOfPet) {
        super(KindOfPet);
    }

    public void display() {
        super.display();
        System.out.println("Age is" + Age);
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
    //@Override
    //public String toString(){
        //return String.format("Age of Pet: " + Age);
    //}
}
