package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    Cat cat;

    @Before
    public void setUpCat() {
        Date birth = new Date(100000);
        cat = new Cat("Kali", birth, 2030 );
        cat.eat(new Food());
        cat.eat(new Food());
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void nameCatTest(){
        String expected = "Kali";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `speak`
    @Test
    public void speakCatTest(){
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void birthDateCatTest(){
        Date expected = new Date(100000);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatCatTest() {
        Integer expected = 2;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void idCatTest() {
        Integer expected = 2030;
        Integer actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance;
    //  google search `java instanceof keyword`
    @Test
    public void animalInheritanceCatTest(){
        Boolean isTrue = cat instanceof Animal;
        Assert.assertTrue(isTrue);
    }

    // TODO - Create test to check Mammal inheritance;
    //  google search `java instanceof keyword`
    @Test
    public void mammalInheritanceCatTest(){
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
