package de.iad.ef.model;

public abstract class LImitedCounter extends BasicCounter {
    private final Integer Default_Maximum = Integer.MAX_VALUE;
    private final Integer Default_Minimum = Integer.MIN_VALUE;
    private Integer maximumCount;
    private Integer minimumCount;

    //Methoden
    //Konstructoren

    protected LImitedCounter(){
    this (0,999); //reicht weiter an nächsten Konstruktor
    }
    protected LImitedCounter(Integer min, Integer max) {
    super(min);
        this.minimumCount=min;
        this.maximumCount=max;

    }
     //Getter
    public Integer maximumIs(){
        return maximumCount;

    }
    public Integer minimumIs(){
        return minimumCount;
    }

    // Normale Methoden
    public Boolean isMaximumReached(){
        return this.currentCount().equals(this.maximumCount);  //Geht genauso wie das drunter
    }
    public Boolean isMinimumReached(){
        if (this.currentCount().equals(this.minimumCount)) {return true;}
        else return false;
    }

}
