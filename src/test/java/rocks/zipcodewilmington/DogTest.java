package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Animal;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog fido;

    @Before
    public void setDog() {
        Date birth = new Date(10101);
        fido = new Dog("Fido", birth, 2048);
        for(int i = 0; i < 6; i++) {
            fido.eat(new Food());
        }
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void nameDogTest() {
        fido.setName("William");
        String expected = "William";
        String actual = fido.getName();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakDogTest() {
        String expected = "bark!";
        String actual = fido.speak();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void birthdateDogTest(){
        Date newBirth = new Date(15000);
        fido.setBirthDate(newBirth);
        Date expected = new Date(15000);
        Date actual = fido.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatDogTest() {
        Integer expected = 6;
        Integer actual = fido.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void idDogTest() {
        Integer expected = 2048;
        Integer actual = fido.getId();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        Assert.assertTrue(fido instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        Assert.assertTrue(fido instanceof Mammal);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
