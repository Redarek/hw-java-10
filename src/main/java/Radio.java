public class Radio {
    protected int currentStation;
    protected int currentVolume;
    protected int numberOfStations;

    public Radio(int numberOfStations) {
            this.numberOfStations = numberOfStations;
    }

    public Radio() {
        this.numberOfStations = 10;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void next() {
        if (currentStation == (numberOfStations - 1)) {
            currentStation = 0;
        }
        else {
            currentStation++;
        }
    }
    public void prev() {
        if (currentStation == 0) {
            currentStation = (numberOfStations - 1);
        }
        else {
            currentStation--;
        }
    }
}
