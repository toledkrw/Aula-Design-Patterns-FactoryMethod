package animal.animalList;

public class Unicorn {
    private String animalType = "unicorn";

    public String getAnimalType() {
        return animalType;
    }

    public String eat(){
        return String.format("This %s is eating. Look how lovely it looks munching it's food.", this.getAnimalType());
    }
    public String poop(){
        return String.format("This %s is pooping. Don't look at it. You're making it shy.", this.getAnimalType());
    }
    public String reproduce(){
        return String.format("This %s is wanting to procreate.", this.getAnimalType());
    }
}
