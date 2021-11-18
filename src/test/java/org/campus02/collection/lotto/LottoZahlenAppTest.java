package org.campus02.collection.lotto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoZahlenAppTest {

    @Test
    void generateRandomNumbers() {
        int[] numbers = LottoZahlenApp.generateRandomNumbers(1000000, 1);
        Assertions.assertEquals( 1000000, numbers.length );
        for (int number : numbers) {
            Assertions.assertEquals(1, number);
        }
    }
}