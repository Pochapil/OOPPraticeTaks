package person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person firstPerson = new Person();
    Person secondPerson = new Person("Dima","Morozov");
    Person thirdPerson = new Person(3321);
    @Test
    void setFirstName() {
        firstPerson.setFirstName("Bagration");
    }

    @Test
    void setLastName() {
        firstPerson.setLastName("Megrelishvili");
    }

    @Test
    void setPassportId() {
        firstPerson.setPassportId(332);
    }

    @Test
    void getFirstName() {
        System.out.println("name: " + secondPerson.getFirstName());
    }

    @Test
    void getLastName() {
        System.out.println("surname: " + secondPerson.getLastName());
    }

    @Test
    void getPassportId() {
        System.out.println("passportId: " + thirdPerson.getPassportId());
    }
}