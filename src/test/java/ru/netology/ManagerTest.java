package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void findMaxLast() {
        Manager man = new Manager(2);
        for (int i = 0; i < 10; i++) {
            man.add(new Moviesdatas(2, "Test", "comedy"));
        }
        Moviesdatas[] actual = man.findMaxLast();
        assertEquals(2, actual.length);
    }

    @Test
    void findMaxLast2() {
        Manager man = new Manager();
        for (int i = 0; i <= 10; i++) {
            man.add(new Moviesdatas(20, "Test", "comedy"));
        }
        Moviesdatas[] actual = man.findMaxLast();
        assertEquals(10, actual.length);
    }

    @Test
    void findMaxLast3() {
        Manager man = new Manager(20);
        for (int i = 0; i < 30; i++) {
            man.add(new Moviesdatas(2, "Test", "comedy"));
        }
        Moviesdatas[] actual = man.findMaxLast();
        assertEquals(20, actual.length);
    }
    @Test
    void findAll() {
        Manager man = new Manager(); {

            man.add(new Moviesdatas(20, "Test", "comedy"));
        }
        Moviesdatas[] actual = man.findAll();
        assertEquals(1, actual.length);
    }
    @Test
    void findAll2() {
        Manager man = new Manager(); {

            man.add(new Moviesdatas(20, "Test", "comedy"));
            man.add(new Moviesdatas(21, "Test", "comedy"));
            man.add(new Moviesdatas(2, "Test", "comedy"));
        }
        Moviesdatas[] actual = man.findAll();
        assertEquals(3, actual.length);
    }
}