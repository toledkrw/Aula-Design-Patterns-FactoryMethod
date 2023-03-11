package animal.animalList;

import animal.iAnimal;

public class Duck implements iAnimal {
    private String animalType = "duck";

    public String getAnimalType() {
        return animalType;
    }

    public String eat(){
        return String.format("This %s is eating meat. It's staring at you, you should probably run.", this.getAnimalType());
    }
    public String poop(){
        return String.format("This %s is pooping. Don't look at it. You're making it shy.", this.getAnimalType());
    }
    public String reproduce(){
        return String.format("This %s is wanting to procreate.", this.getAnimalType());
    }
}
