public class Radio {
    public int currentStation;
    public int currentVolume;

    public void increaseVolume() {
        if ((currentVolume < 10) && (currentVolume >= 0)) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if ((currentVolume <= 10) && (currentVolume > 0)) {
            currentVolume--;
        }
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        else if ((currentStation < 9) && (currentStation >= 0)) {
            currentStation++;
        }
    }
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        else if ((currentStation < 10) && (currentStation > 0)) {
            currentStation--;
        }
    }
}
