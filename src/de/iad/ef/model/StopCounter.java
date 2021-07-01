package de.iad.ef.model;

public class StopCounter extends LImitedCounter {

    public StopCounter(){
        super();
    }

    public StopCounter(Integer mincount, Integer maxcount){
        super(mincount,maxcount);
    }

    @Override
    public void count() {
        do {               //if(!super.isminimumreached(){this.count();
            super.count();
        }while (super.isMaximumReached() == false);
    }

    @Override
    public void uncount() {
        do {
            super.uncount();
        }while (super.isMinimumReached() == false);
    }
}