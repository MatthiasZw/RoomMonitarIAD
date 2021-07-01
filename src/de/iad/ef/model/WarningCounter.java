package de.iad.ef.model;

public class WarningCounter extends LImitedCounter {

    public WarningCounter() {
        super();
    }

    public WarningCounter(Integer mincount, Integer maxcount) {
        super(mincount, maxcount);

    }

    @Override
    public void count() {
        if (!super.isMaximumReached()) {
            super.count();
        } else {
            throw new CounterException("Maximum wurde erreicht");

        }}

        @Override
        public void uncount() {
            if (!super.isMinimumReached()) {
                super.uncount();
            } else { throw new CounterException("Minimum wurde erreicht");
            }

        }
    }
