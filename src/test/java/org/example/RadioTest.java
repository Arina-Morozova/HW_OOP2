package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseMinVolume() {
    Radio vol = new Radio(0, 9, 2, 0, 100, 0, 10);
    vol.setCurrentVolume(0);
    vol.increaseVolume();

    int expected = 1;
    int actual = vol.getCurrentVolume();

    Assertions.assertEquals(expected, actual);
}


    @Test
    public void shouldIncreaseMaxVolume() {
        Radio vol = new Radio(0, 9, 2, 0, 100, 100, 10);
        vol.setCurrentVolume(100);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseAverageVolume() {
        Radio vol = new Radio(0, 9, 2, 0, 100, 50, 10);
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
        Radio vol = new Radio(0, 9, 2, 0, 100, 100, 10);
        vol.setCurrentVolume(100);
        vol.decreaseVolume();

        int expected = 99;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseAverageVolume() {
        Radio vol = new Radio(0, 9, 2, 0, 100, 50, 10);
        vol.setCurrentVolume(50);
        vol.decreaseVolume();

        int expected = 49;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationIfMin() {
        Radio stat = new Radio(0, 18, 0, 0, 100, 0, 10);
        stat.setCurrentStation(0);
        stat.nextStation();

        int expected = 1;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationIfMax() {
        Radio stat = new Radio();
        stat.setCurrentStation(17);
        stat.nextStation();

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationIfAverage() {
        Radio stat = new Radio(0, 9, 5, 0, 100, 0, 10);
        stat.setCurrentStation(5);
        stat.nextStation();

        int expected = 6;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStationIfMin() {
        Radio stat = new Radio(0, 22, 0, 0, 100, 0, 10);
        stat.setCurrentStation(0);
        stat.prevStation();

        int expected = 22;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStationIfMax() {
        Radio stat = new Radio(0, 9, 9, 0, 100, 101, 10);
        stat.setCurrentStation(9);
        stat.prevStation();

        int expected = 8;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStationIfAverage() {
        Radio stat = new Radio(0, 9, 5, 0, 100, 101, 10);
        stat.setCurrentStation(5);
        stat.prevStation();

        int expected = 4;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationIfMin() {
        Radio stat = new Radio();
        stat.setCurrentStation(0);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationIfMax() {
        Radio stat = new Radio(0, 15, 15, 0, 100, 101, 10);
        stat.setCurrentStation(15);

        int expected = 15;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationIfAverage() {
        Radio stat = new Radio(0, 9, 5, 0, 100, 101, 10);
        stat.setCurrentStation(5);

        int expected = 5;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationIfLessMin() {
        Radio stat = new Radio();
        stat.setCurrentStation(-1);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIfMoreMax() {
        Radio stat = new Radio();
        stat.setCurrentStation(16);

        int expected = 0;
        int actual = stat.getCurrentStation();

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
        Radio vol = new Radio(0, 9, 2, 0, 100, 100, 10);
        vol.setCurrentVolume(100);

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIfAverage() {
        Radio vol = new Radio(0, 9, 2, 0, 100, 50, 10);
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