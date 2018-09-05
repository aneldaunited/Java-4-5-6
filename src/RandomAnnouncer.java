
public class RandomAnnouncer extends Announcer {

    @Override
    public boolean chooseNextNumber() {
        int announcerValue;
        announcerValue = (int) (Math.random() * 90) + 10;

        return announceNextNumber(announcerValue);
    }
}