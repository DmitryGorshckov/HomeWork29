package ru.gorshckov;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    private Person person1 = new Person("bob",23,'m');
    private Person person2 = new Person("bob",26,'m');
    private Person person3 = new Person("bob",23,'m');

    @Test
    public void equalsTest() {

        Assert.assertTrue(person1.equals(person1));
        Assert.assertTrue(!person1.equals(null));
        Assert.assertTrue(!person1.equals(person2));

    }

    @Test
    public void hashCodeTest () {

        Assert.assertTrue(person1.equals(person3));
        Assert.assertTrue(person1.hashCode()==person3.hashCode());
    }
}