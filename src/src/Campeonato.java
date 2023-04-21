package src;

import java.util.ArrayList;

public class Campeonato {

    private ArrayList<Time> times = new ArrayList<>();

    public Campeonato(){}

    public void setTimes(Time times) {
        this.times.add(times);
    }
}
