public class TypeOfPet {
    private String TypePet;

    public TypeOfPet(){}

    public TypeOfPet(String TypePet){
        this.TypePet = TypePet;
    }
    public void display(){
        System.out.println("Type of Pet: " + TypePet);
    }

    public String getTypePet() {
        return TypePet;
    }

    public void setTypePet(String typePet) {
        TypePet = typePet;
    }
    //@Override
    //public String toString(){
        //return String.format("Type of Pet: " + TypePet);
    //}
}
