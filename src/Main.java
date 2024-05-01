import java.util.ArrayList;

public class Main {
    private ArrayList<Integer> AgeArray = new ArrayList<>();

    public void addAge(int ageOfPet){
        AgeArray.add(ageOfPet);
    }
    public void removeAge(AgeOfPet ageOfPet){
        AgeArray.remove(ageOfPet);
    }
    public void printAge(){
        for(Integer ageOfPet : AgeArray){
            System.out.println("Age: " + ageOfPet);
        }
        System.out.println("----------");
    }







}
