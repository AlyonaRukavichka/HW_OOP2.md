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
        radio.prevNineIfCurrentZero();

        int expected = 9;
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
    public void shouldSetQuieterVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        radio.QuieterVolume();

        int expected = 29;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


