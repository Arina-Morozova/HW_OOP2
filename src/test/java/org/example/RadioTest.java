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
    public void shouldSetNextRadioStationIf0() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);
        stat.nextRadioStation();

        int expected = 1;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextRadioStationIf9() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(9);
        stat.nextRadioStation();

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextRadioStationIfAverage() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(5);
        stat.nextRadioStation();

        int expected = 6;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevRadioStationIf0() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);
        stat.prevRadioStation();

        int expected = 9;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevRadioStationIf9() {
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
    public void shouldSetRadioStationIf0() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIf9() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(9);

        int expected = 9;
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
    public void shouldSetRadioStationIfLess0() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationIfMore9() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(10);

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIf0() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIf100() {
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
    public void shouldSetVolumeIfLess0() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIfMore100() {
        Radio vol = new Radio();
        vol.setCurrentVolume(101);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
