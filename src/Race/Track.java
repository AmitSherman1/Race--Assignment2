/*Amit Sherman 209284017
Stav Zysblatt 313434748 */
package Race;

public class Track {
    private int finishedRacers;

    public Track() {
        this.finishedRacers = 0;
    }

    public int getFinishedRacers() {
        return finishedRacers;
    }

    public void racerFinished(int place) { //Increments the place that the runner has finished
        finishedRacers++;
        System.out.println("Runner " + place + " finished " + finishedRacers + getPlaceSuffix(place));
    }

    private String getPlaceSuffix(int place) { //Responsible for the suffix of the finishing place
        if (place >= 10) {
            return "th";
        } else {
            switch (finishedRacers % 10) {
                case 1:
                    return "st";
                case 2:
                    return "nd";
                case 3:
                    return "rd";
                default:
                    return "th";
            }
        }
    }
}
