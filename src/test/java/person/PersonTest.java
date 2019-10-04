package person;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person firstPerson = new Person();
    Person secondPerson = new Person("Dima","Morozov",2322);
    Person thirdPerson = new Person(3321);
    Person fourthPerson = new Person();
    @Test
    void setFirstName() {
        fourthPerson.setFirstName(null);
        firstPerson.setFirstName("Bagration");
    }

    @Test
    void setLastName() {
        fourthPerson.setLastName(null);
        firstPerson.setLastName("Megrelishvili");
    }

    @Test
    void setPassportId() {
        thirdPerson.setPassportId(332);
    }

    @Test
    void getFirstName() {
        System.out.println("name:"+fourthPerson.getFirstName());
        System.out.println("name:"+thirdPerson.getFirstName());
        System.out.println("name: " + secondPerson.getFirstName());
    }

    @Test
    void getLastName() {
        System.out.println("surname: " + fourthPerson.getLastName());
        System.out.println("surname: " + thirdPerson.getLastName());
        System.out.println("surname: " + secondPerson.getLastName());
    }

    @Test
    void getPassportId() {
        System.out.println("passportId: " + firstPerson.getPassportId());
        System.out.println("passportId: " + thirdPerson.getPassportId());
    }
}