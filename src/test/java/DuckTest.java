import animal.iAnimal;
import animal.AnimalFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuckTest {
    @Test
    void mustEat(){
        iAnimal duck = AnimalFactory.getAnimal("Duck");
        assertEquals("This duck is eating meat. It's staring at you, you should probably run.", duck.eat());
    }

    @Test
    void mustPoop(){
        iAnimal duck = AnimalFactory.getAnimal("Duck");
        assertEquals("This duck is pooping. Don't look at it. You're making it shy.", duck.poop());
    }

    @Test
    void mustReproduce(){
        iAnimal duck = AnimalFactory.getAnimal("Duck");
        assertEquals("This duck is wanting to procreate.", duck.reproduce());
    }
}
