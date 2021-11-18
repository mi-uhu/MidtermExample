package org.campus02.collection.articleapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufsListenAppTest {
    ArrayList<Einkauf> einkaufsliste;

    @BeforeEach
    void init() {
        einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Milch", 1.79));
        einkaufsliste.add(new Einkauf("Brot", 3.2));
        einkaufsliste.add(new Einkauf("Milch", 1.79));
    }

    @Test
    void sum() {
        Assertions.assertEquals( 1.79 * 2 + 3.2, EinkaufsListenApp.sum( einkaufsliste ));
    }

    @Test
    void testHashSet() {
        Assertions.assertEquals( 1.79 + 3.2, EinkaufsListenApp.sum( EinkaufsListenApp.unique( einkaufsliste )));
    }
}