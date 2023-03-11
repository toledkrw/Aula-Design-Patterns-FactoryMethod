import animal.iAnimal;
import animal.AnimalFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnicornTest {
    //All these tests must fail since Unicorn does not implement iAnimal!

    @Test
    void mustEat(){
        iAnimal unicorn = AnimalFactory.getAnimal("Unicorn");
        assertEquals("This unicorn is eating. Look how lovely it looks munching it's food.", unicorn.eat());
    }

    @Test
    void mustPoop(){
        iAnimal unicorn = AnimalFactory.getAnimal("Unicorn");
        assertEquals("This unicorn is pooping. Don't look at it. You're making it shy.", unicorn.poop());
    }

    @Test
    void mustReproduce(){
        iAnimal unicorn = AnimalFactory.getAnimal("Unicorn");
        assertEquals("This unicorn is wanting to procreate.", unicorn.reproduce());
    }
}
