package animal;

public class AnimalFactory {
    public static iAnimal getAnimal(String animal){
        Class aClass = null;
        Object anObject = null;

        try{
            aClass = Class.forName("animal.animalList." + animal);
            anObject = aClass.getDeclaredConstructor().newInstance();
        }
        catch(Exception e){
            throw new IllegalArgumentException("Given Animal does not exists.");
        }
        if(!(anObject instanceof iAnimal)){
            throw new IllegalArgumentException("Invalid Animal. This Animal does not implements iAnimal Interface.");
        }

        return (iAnimal) anObject;
    }
}
