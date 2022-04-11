package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviesDatas;
import ru.netology.domain.MoviesDatas;
import ru.netology.manager.Manager;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void shouldFindMaxOneLastFromList() {

        MoviesDatas first = new MoviesDatas(1, "Test", "horror");
        MoviesDatas second = new MoviesDatas(2, "Test2", "comedy");
        MoviesDatas third = new MoviesDatas(3, "Test2", "horror");
        MoviesDatas forth = new MoviesDatas(4, "Testing", "horror");


        Manager man = new Manager(1);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(forth);


        MoviesDatas[] expected = {forth};
        MoviesDatas[] actual = man.findMaxLast();


        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxOneLastFromOne() {

        MoviesDatas first = new MoviesDatas(1, "Test", "horror");


        Manager man = new Manager(1);
        man.add(first);


        MoviesDatas[] expected = {first};
        MoviesDatas[] actual = man.findMaxLast();


        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxTwoLastFromList() {

        MoviesDatas first = new MoviesDatas(1, "Test", "horror");
        MoviesDatas second = new MoviesDatas(2, "Test2", "comedy");
        MoviesDatas third = new MoviesDatas(3, "Test2", "horror");
        MoviesDatas forth = new MoviesDatas(4, "Testing", "horror");


        Manager man = new Manager(2);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(forth);


        MoviesDatas[] expected = {forth, third};
        MoviesDatas[] actual = man.findMaxLast();


        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxLastWhen9Movies() {

        MoviesDatas first = new MoviesDatas(1, "Test", "horror");
        MoviesDatas second = new MoviesDatas(2, "Test2", "comedy");
        MoviesDatas third = new MoviesDatas(3, "Test2", "horror");
        MoviesDatas forth = new MoviesDatas(4, "Testing", "horror");
        MoviesDatas fifth = new MoviesDatas(5, "Test3", "horror");
        MoviesDatas sixth = new MoviesDatas(6, "Test0", "drama");
        MoviesDatas seventh = new MoviesDatas(7, "Test4", "horror");
        MoviesDatas eighth = new MoviesDatas(8, "Test5", "drama");
        MoviesDatas ninth = new MoviesDatas(9, "Test6", "horror");


        Manager man = new Manager();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(forth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);


        MoviesDatas[] expected = {ninth, eighth, seventh, sixth, fifth, forth, third, second, first};
        MoviesDatas[] actual = man.findMaxLast();


        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxTenLastWhen10Movies() {

        MoviesDatas first = new MoviesDatas(1, "Test", "horror");
        MoviesDatas second = new MoviesDatas(2, "Test2", "comedy");
        MoviesDatas third = new MoviesDatas(3, "Test2", "horror");
        MoviesDatas forth = new MoviesDatas(4, "Testing", "horror");
        MoviesDatas fifth = new MoviesDatas(5, "Test3", "horror");
        MoviesDatas sixth = new MoviesDatas(6, "Test0", "drama");
        MoviesDatas seventh = new MoviesDatas(7, "Test4", "horror");
        MoviesDatas eighth = new MoviesDatas(8, "Test5", "drama");
        MoviesDatas ninth = new MoviesDatas(9, "Test6", "horror");
        MoviesDatas tenth = new MoviesDatas(10, "Test7", "comedy");


        Manager man = new Manager();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(forth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);


        MoviesDatas[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second, first};
        MoviesDatas[] actual = man.findMaxLast();


        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxTenLastWhen11Movies() {

        MoviesDatas first = new MoviesDatas(1, "Test", "horror");
        MoviesDatas second = new MoviesDatas(2, "Test2", "comedy");
        MoviesDatas third = new MoviesDatas(3, "Test2", "horror");
        MoviesDatas forth = new MoviesDatas(4, "Testing", "horror");
        MoviesDatas fifth = new MoviesDatas(5, "Test3", "horror");
        MoviesDatas sixth = new MoviesDatas(6, "Test0", "drama");
        MoviesDatas seventh = new MoviesDatas(7, "Test4", "horror");
        MoviesDatas eighth = new MoviesDatas(8, "Test5", "drama");
        MoviesDatas ninth = new MoviesDatas(9, "Test6", "horror");
        MoviesDatas tenth = new MoviesDatas(10, "Test7", "comedy");
        MoviesDatas eleventh = new MoviesDatas(11, "Test8", "comedy");

        Manager man = new Manager();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(forth);
        man.add(fifth);
        man.add(sixth);
        man.add(seventh);
        man.add(eighth);
        man.add(ninth);
        man.add(tenth);
        man.add(eleventh);


        MoviesDatas[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second};
        MoviesDatas[] actual = man.findMaxLast();


        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind1From1() {
        MoviesDatas first = new MoviesDatas(1, "Test", "horror");


        Manager man = new Manager();
        man.add(first);


        MoviesDatas[] expected = {first};
        MoviesDatas[] actual = man.findAll();


        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindAllFromList() {
        MoviesDatas first = new MoviesDatas(1, "Test", "horror");
        MoviesDatas second = new MoviesDatas(2, "Test2", "comedy");
        MoviesDatas third = new MoviesDatas(3, "Test2", "horror");
        MoviesDatas forth = new MoviesDatas(4, "Testing", "horror");


        Manager man = new Manager();
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(forth);


        MoviesDatas[] expected = {first, second, third, forth};
        MoviesDatas[] actual = man.findAll();


        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindMaxTwoLastAndShow() {

        MoviesDatas first = new MoviesDatas(1, "Test", "horror");
        MoviesDatas second = new MoviesDatas(2, "Test2", "comedy");
        MoviesDatas third = new MoviesDatas(3, "Test2", "horror");
        MoviesDatas forth = new MoviesDatas(4, "Testing", "horror");


        Manager man = new Manager(2);
        man.add(first);
        man.add(second);
        man.add(third);
        man.add(forth);


        MoviesDatas[] actual = man.findMaxLast();
        System.out.println(Arrays.toString(actual));

        assertEquals(2, actual.length);

    }
}