package ru.netology.HWOOP2.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberOfStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(6);

        int expected = 6;
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
    public void shouldSetCurrentNumberOfStationZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(0);

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
    public void shouldSetCurrentNumberOfStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberOfStationNine() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(8);
        radio.nextNumberOfStation();

        int expected = 9;
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
    public void shouldSetNineNumberOfStationIfPrevZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberOfStation(0);
        radio.prevNumberOfStation();

        int expected = 9;
        int actual = radio.getCurrentNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnderMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBeforMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

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
        radio.quieterVolume();

        int expected = 29;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuieterVolumeEqualsZeroIfCurrentIsZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.quieterVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


