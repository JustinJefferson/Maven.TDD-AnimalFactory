package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        Cat cat =  AnimalFactory.createCat("Tom", new Date(82828282));
        Integer id = cat.getId();
        CatHouse.add(cat);

        Cat expected = cat;
        Cat actual = CatHouse.getCatById(id);

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest() {
        Cat cat = AnimalFactory.createCat("Tom", new Date(82828282));
        Integer id = cat.getId();
        CatHouse.add(cat);
        CatHouse.remove(id);

        Cat expected = null;
        Cat actual = CatHouse.getCatById(id);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByObjectTest() {
        Cat cat = AnimalFactory.createCat("Tom", new Date(82828282));
        Integer id = cat.getId();
        CatHouse.add(cat);
        CatHouse.remove(cat);

        Cat expected = null;
        Cat actual = CatHouse.getCatById(id);

        Assert.assertEquals(expected, actual);
    }



    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        Cat cat =  AnimalFactory.createCat("Suzie", new Date(6000000));
        Integer id = cat.getId();
        CatHouse.add(cat);

        Cat expected = cat;
        Cat actual = CatHouse.getCatById(id);

        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        CatHouse.clear();

        Cat cat =  AnimalFactory.createCat("Suzie", new Date(6000000));
        CatHouse.add(cat);
        Cat cat1 = AnimalFactory.createCat("Tom", new Date(12345678));
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat("Sakamoto", new Date(454545454));
        CatHouse.add(cat2);

        Integer expected = 3;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }
}
