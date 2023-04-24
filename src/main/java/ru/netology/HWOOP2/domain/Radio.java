package ru.netology.HWOOP2.domain;

public class Radio {
    private int currentNumberOfStation;
    private int currentVolume;

    public int getCurrentNumberOfStation() {
        return currentNumberOfStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumberOfStation(int newCurrentNumberOfStation) {
        if (newCurrentNumberOfStation < 0) {
            return;
        }
        if (newCurrentNumberOfStation > 9) {
            return;
        }
        currentNumberOfStation = newCurrentNumberOfStation;
    }

    public void nextNumberOfStation() {
        if (currentNumberOfStation < 9) {
            currentNumberOfStation = currentNumberOfStation + 1;
        }
        if (currentNumberOfStation == 9) {
            currentNumberOfStation = 0;
        }
    }

    public void prevNumberOfStation() {
        if (currentNumberOfStation <= 9) {
            currentNumberOfStation = currentNumberOfStation - 1;
        }
    }

    public void prevNineIfCurrentZero() {
        if (currentNumberOfStation == 0) {
            currentNumberOfStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void QuieterVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}



