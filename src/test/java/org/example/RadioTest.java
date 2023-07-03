package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseMinVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.increaseVolume();

        int expected = 1;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseMaxVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseAverageVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(50);
        vol.increaseVolume();

        int expected = 51;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseMinVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseMaxVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.decreaseVolume();

        int expected = 99;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseAverageVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(50);
        vol.decreaseVolume();

        int expected = 49;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextRadioStationIfMin() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);
        stat.nextRadioStation();

        int expected = 1;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextRadioStationIfMax() {
        Radio stat = new Radio(18);
        stat.setCurrentRadioStation(17);
        stat.nextRadioStation();

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextRadioStationIfAverage() {
        Radio stat = new Radio(15);
        stat.setCurrentRadioStation(5);
        stat.nextRadioStation();

        int expected = 6;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevRadioStationIfMin() {
        Radio stat = new Radio(22);
        stat.setCurrentRadioStation(0);
        stat.prevRadioStation();

        int expected = 21;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevRadioStationIfMax() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(9);
        stat.prevRadioStation();

        int expected = 8;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevRadioStationIfAverage() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(5);
        stat.prevRadioStation();

        int expected = 4;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIfMin() {
        Radio stat = new Radio(4);
        stat.setCurrentRadioStation(0);

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIfMax() {
        Radio stat = new Radio(16);
        stat.setCurrentRadioStation(15);

        int expected = 15;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIfAverage() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(5);

        int expected = 5;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIfLessMin() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIfMoreMax() {
        Radio stat = new Radio(15);
        stat.setCurrentRadioStation(15);

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIfMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIfMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIfAverage() {
        Radio vol = new Radio();
        vol.setCurrentVolume(50);

        int expected = 50;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIfLessMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIfMoreMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(101);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
