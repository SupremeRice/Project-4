public class KindOfPet extends TypeOfPet{
    private String KindOfPet;
    public KindOfPet(String TypeOfPet, String KindOfPet) {
        super(TypeOfPet);
        this.KindOfPet = KindOfPet;
    }

    public KindOfPet(String kindOfPet) {
    }

    public void display(){
        super.display();
        System.out.println("Kind of Pet: " + KindOfPet);
    }

    public String getKindOfPet() {
        return KindOfPet;
    }

    public void setKindOfPet(String kindOfPet) {
        KindOfPet = kindOfPet;
    }
    //@Override
    //public String toString(){
        //return String.format("Kind of Pet: " + KindOfPet);
    //}
}
