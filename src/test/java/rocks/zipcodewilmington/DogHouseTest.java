package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    private Dog dog1;
    private Dog dog2;

    @Before
    public void setup() {
        dog1 = AnimalFactory.createDog("Kevin", new Date(76767676));
        dog2 = AnimalFactory.createDog("Jeramiah", new Date(90909090));
        DogHouse.clear();
        DogHouse.add(dog1);
        DogHouse.add(dog2);
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        Dog dog3 = AnimalFactory.createDog("Banjyaku", new Date(43434343));
        Integer id = dog3.getId();
        DogHouse.add(dog3);

        Dog expected = dog3;
        Dog actual = DogHouse.getDogById(id);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogByIdTest() {
        Dog dog3 = AnimalFactory.createDog("Banjyaku", new Date(43434343));
        Integer id = dog3.getId();
        DogHouse.add(dog3);
        DogHouse.remove(id);

        Dog expected = null;
        Dog actual = DogHouse.getDogById(id);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        Dog dog3 = AnimalFactory.createDog("Banjyaku", new Date(43434343));
        Integer id = dog3.getId();
        DogHouse.add(dog3);
        DogHouse.remove(dog3);

        Dog expected = null;
        Dog actual = DogHouse.getDogById(id);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        Dog dog3 = AnimalFactory.createDog("Banjyaku", new Date(43434343));
        Integer id = dog3.getId();
        DogHouse.add(dog3);

        Dog expected = dog3;
        Dog actual = DogHouse.getDogById(id);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
