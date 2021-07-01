package de.iad.ef.model;

public class RolloverCounter extends LImitedCounter {


    @Override
    public void count() {
        if (super.currentCount().equals(super.maximumIs())) {
            setCount(minimumIs());
        } else super.count();
    }

    @Override
    public void uncount() {
        if (super.currentCount().equals(super.minimumIs())) {
            setCount(maximumIs());
        } else super.uncount();
    }
}

