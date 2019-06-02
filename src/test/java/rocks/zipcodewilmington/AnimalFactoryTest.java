package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import java.util.Date;
import rocks.zipcodewilmington.animals.Dog;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        Dog dog1 = AnimalFactory.createDog("Skipper", new Date(12121212));


        String expectedName = "Skipper";
        String actualName = dog1.getName();

        Date expectedDate = new Date(12121212);
        Date actualDate = dog1.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        Cat cat = AnimalFactory.createCat("Sir Pudditat", new Date(13131313));

        String expectedName = "Sir Pudditat";
        String actualName = cat.getName();

        Date expectedDate = new Date(13131313);
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
