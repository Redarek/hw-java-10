import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void increaseVolumeInInterval() {
        Radio radio = new Radio();

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeInInterval() {
        Radio radio = new Radio();

        radio.currentVolume = 1;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOverInterval() {
        Radio radio = new Radio();

        radio.currentVolume = 10;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeOverInterval() {
        Radio radio = new Radio();

        radio.currentVolume = 0;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationInInterval() {
        Radio radio = new Radio();

        radio.next();
        int expected = 1;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationInInterval() {
        Radio radio = new Radio();

        radio.currentStation = 1;
        radio.prev();
        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationOverInterval() {
        Radio radio = new Radio();

        radio.currentStation = 9;
        radio.next();
        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationOverInterval() {
        Radio radio = new Radio();

        radio.currentStation = 0;
        radio.prev();
        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }
}
