import animal.iAnimal;
import animal.AnimalFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalFactoryTest {
    @Test
    public void mustReturnNotExistentAnimal(){
        try{
            iAnimal animal = AnimalFactory.getAnimal("Chimera");
            fail();
        }
        catch(IllegalArgumentException  e){
            assertEquals("Given Animal does not exists.", e.getMessage());
        }
    }

    @Test
    public void mustReturnInvalidAnimalImplementation(){
        try{
            iAnimal animal = AnimalFactory.getAnimal("Unicorn");
            fail();
        }
        catch(IllegalArgumentException  e){
            assertEquals("Invalid Animal. This Animal does not implements iAnimal Interface.", e.getMessage());
        }
    }

}
