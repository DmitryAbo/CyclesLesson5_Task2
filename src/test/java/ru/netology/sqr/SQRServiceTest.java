package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void caclulateNumSqr(String testName, int lowLimit, int UpLimit, int expected) {

        SQRService numSqr = new SQRService();

        int actual = numSqr.calculate(lowLimit, UpLimit);
        assertEquals(expected, actual);

    }
}