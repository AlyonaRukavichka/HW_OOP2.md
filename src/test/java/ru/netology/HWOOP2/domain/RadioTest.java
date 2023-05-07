package ru.netology.HWOOP2.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void testSet() {
        Radio radio = new Radio(25);

        radio.setCurrentNumberOfStation(13);

        int expected = 13;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberOfStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(8);

        int expected = 8;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumberOfStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumberOfStationUnderNine() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberOfStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(7);
        radio.nextNumberOfStation();

        int expected = 8;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextZeroStationIfCurrentNine() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(9);
        radio.nextNumberOfStation();

        int expected = 0;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextZeroStationIfCurrentMax() {
        Radio radio = new Radio(23);

        radio.setCurrentNumberOfStation(22);
        radio.nextNumberOfStation();

        int expected = 0;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberOfStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(7);
        radio.prevNumberOfStation();

        int expected = 6;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberOfStationIfCurrentNine() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(9);
        radio.prevNumberOfStation();

        int expected = 8;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberOfStationIfCurrentMax() {
        Radio radio = new Radio(23);

        radio.setCurrentNumberOfStation(22);
        radio.prevNumberOfStation();

        int expected = 21;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineNumberOfStationIfPrevZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(0);
        radio.prevNumberOfStation();

        int expected = 9;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberOfStationIfPrevZero() {
        Radio radio = new Radio(24);

        radio.setCurrentNumberOfStation(0);
        radio.prevNumberOfStation();

        int expected = 23;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeHigherMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(25);
        radio.increaseVolume();

        int expected = 26;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeOneHundredIfCurrentVolumeOneHundred() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuieterVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        radio.QuieterVolume();

        int expected = 29;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuieterVolumeEqualsZeroIfCurrentIsZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.QuieterVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


