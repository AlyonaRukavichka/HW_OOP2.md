package ru.netology.HWOOP2.domain;

public class Radio {
    private int currentNumberOfStation;
    private int minNumberOfStation;
    private int maxNumberOfStation;
    private int AmountStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.maxNumberOfStation = 9;
        this.minNumberOfStation = 0;
        this.AmountStation = 10;
    }

    public Radio(int AmountStation) {
        this.maxNumberOfStation = AmountStation - 1;
    }

    public int getAmountStation() {
        return AmountStation;
    }

    public void setAmountStation(int newAmountStation) {
        if (newAmountStation < minNumberOfStation) {
            return;
        }
        if (newAmountStation > maxNumberOfStation + 1) {
            return;
        }
        AmountStation = newAmountStation;
    }

    public int getCurrentNumberOfStation() {
        return currentNumberOfStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumberOfStation(int newCurrentNumberOfStation) {
        if (newCurrentNumberOfStation < minNumberOfStation) {
            return;
        }
        if (newCurrentNumberOfStation > maxNumberOfStation) {
            return;
        }
        currentNumberOfStation = newCurrentNumberOfStation;
    }

    public void nextNumberOfStation() {
        if (currentNumberOfStation != maxNumberOfStation) {
            currentNumberOfStation = currentNumberOfStation + 1;
        } else {
            currentNumberOfStation = minNumberOfStation;
        }
    }

    public void prevNumberOfStation() {
        if (currentNumberOfStation != minNumberOfStation) {
            currentNumberOfStation = currentNumberOfStation - 1;
        } else {
            currentNumberOfStation = maxNumberOfStation;
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
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void quieterVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }
}



