package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({"'calculateNumSqrLow0Up100', 0, 100, 0", "'calculateNumSqrLow99Up10000', 99, 10000, 90"})
    void caclulateNumSqr(String testName, int lowLimit, int UpLimit, int expected) {

        SQRService numSqr = new SQRService();

        int actual = numSqr.calculate(lowLimit, UpLimit);
        assertEquals(expected, actual);

    }
}