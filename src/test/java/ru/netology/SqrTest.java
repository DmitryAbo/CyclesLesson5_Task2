package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SqrTest {

    @ParameterizedTest
    @CsvSource({"'calculateNumSqrLow0Up100', 0, 100, 0", "'calculateNumSqrLow99Up10000', 99, 10000, 90"})
    void caclulateNumSqr(String testName, int lowLimit, int UpLimit, int expected) {

        Sqr calculate = new Sqr();

        int actual = calculate.numSqr(lowLimit, UpLimit);
        assertEquals(expected, actual);

    }
}