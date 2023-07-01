package org.example;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    public int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    public int currentVolume;

    public Radio(int size) {
        maxRadioStation = minRadioStation + size;
    }

    public Radio(int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    //Установить радиостанцию
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //Увеличение громкости
    public void increaseVolume() {
        if (currentVolume < minVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    //Уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > maxVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    //Следующая радиостанция
    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }

    }

    //Предыдущая радиостанция
    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
}