package ru.ssau.tk.mggrndn.ooppractice.person;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person firstPerson = new Person();
    Person secondPerson = new Person("Dima", "Morozov", 2322);
    Person thirdPerson = new Person(3321);
    Person fourthPerson = new Person();

    @Test
    void setFirstName() {
        fourthPerson.setFirstName(null);
        firstPerson.setFirstName("Bagration");
        assertEquals(firstPerson.getFirstName(), "Bagration");
    }

    @Test
    void setLastName() {
        fourthPerson.setLastName(null);
        firstPerson.setLastName("Megrelishvili");
    }

    @Test
    void setPassportId() {
        thirdPerson.setPassportId(332);
        assertEquals(thirdPerson.getPassportId(), 332);
    }

    @Test
    void getFirstName() {
        assertEquals(fourthPerson.getFirstName(), null);
        assertEquals(thirdPerson.getFirstName(), null);
        assertEquals(secondPerson.getFirstName(), "Dima");
    }

    @Test
    void getLastName() {
        assertEquals(fourthPerson.getLastName(), null);
        assertEquals(thirdPerson.getLastName(), null);
        assertEquals(secondPerson.getLastName(), "Morozov");
    }

    @Test
    void getPassportId() {
        assertEquals(firstPerson.getPassportId(), 0);
        assertEquals(thirdPerson.getPassportId(), 3321);
    }
}