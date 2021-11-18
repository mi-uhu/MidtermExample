package org.campus02.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void init() {
        person = new Person( "a", "b", 190, (byte)3);
    }

    @Test
    void rechneBMI() {
        Assertions.assertEquals( "Untergewicht", person.rechneBMI( 60 ) );
        Assertions.assertEquals( "Normalgewicht", person.rechneBMI( 80 ) );
        Assertions.assertEquals( "Uebergewicht", person.rechneBMI( 100 ) );
        Assertions.assertEquals( "Adipositas", person.rechneBMI( 110 ) );
    }
}