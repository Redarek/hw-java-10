public class Radio {
    public int currentStation;
    public int currentVolume;
    public int numberOfStations;

    public Radio(int numberOfStations) {
        if (numberOfStations > 0) {
            this.numberOfStations = numberOfStations;
        }
    }

    public Radio() {
        this.numberOfStations = 10;
    }

    public void increaseVolume() {
        if ((currentVolume < 100) && (currentVolume >= 0)) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if ((currentVolume <= 100) && (currentVolume > 0)) {
            currentVolume--;
        }
    }

    public void next() {
        if (currentStation == (numberOfStations - 1)) {
            currentStation = 0;
        }
        else if ((currentStation < (numberOfStations - 1)) && (currentStation >= 0)) {
            currentStation++;
        }
    }
    public void prev() {
        if (currentStation == 0) {
            currentStation = (numberOfStations - 1);
        }
        else if ((currentStation < numberOfStations) && (currentStation > 0)) {
            currentStation--;
        }
    }
}
