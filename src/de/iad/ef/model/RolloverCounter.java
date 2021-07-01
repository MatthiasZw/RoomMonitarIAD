package de.iad.ef.model;

public class RolloverCounter extends LImitedCounter {

public RolloverCounter(){
    super();
    }

public RolloverCounter(Integer mincount, Integer maxcount){
    super(mincount,maxcount);

}

    @Override
    public void count() {
        if (super.isMaximumReached()) {
            this.setCount(minimumIs());
            return;
        } super.count();
    }

    @Override
    public void uncount() {
        if (super.isMinimumReached()) {
            this.setCount(maximumIs());
        } else super.uncount();
    }
}


