package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int minStation;
    private int maxStation;
    private int currentStation;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;
    private int defaultStations = 10;

    //Увеличение громкости
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    //Уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    //Следующая радиостанция
    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }

    }

    //Предыдущая радиостанция
    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}