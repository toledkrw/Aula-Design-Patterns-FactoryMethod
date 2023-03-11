import animal.iAnimal;
import animal.AnimalFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {
    @Test
    void mustEat(){
        iAnimal dog = AnimalFactory.getAnimal("Dog");
        assertEquals("This dog is eating. Look how lovely it looks munching it's food.", dog.eat());
    }

    @Test
    void mustPoop(){
        iAnimal dog = AnimalFactory.getAnimal("Dog");
        assertEquals("This dog is pooping. Don't look at it. You're making it shy.", dog.poop());
    }

    @Test
    void mustReproduce(){
        iAnimal dog = AnimalFactory.getAnimal("Dog");
        assertEquals("This dog is wanting to procreate.", dog.reproduce());
    }
}
