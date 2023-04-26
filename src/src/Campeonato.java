package src;

import java.util.ArrayList;

public class Campeonato{

    private ArrayList<Time> times = new ArrayList<>();

    public Campeonato(){}

    public void setTimes(Time times) {
        this.times.add(times);
    }
    
    public ArrayList<Time> getTimes(){
        return this.times;
    }
    
    public void mostarTimes(){
        for (Time time:times){
            System.out.println(time.getNome());
        }
    }
    public ArrayList<Time> getTime(){
        return this.times;
    }
}
