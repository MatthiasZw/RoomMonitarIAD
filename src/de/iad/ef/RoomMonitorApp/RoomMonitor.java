package de.iad.ef.RoomMonitorApp;

import de.iad.ef.model.WarningCounter;

public class RoomMonitor extends WarningCounter {

    private Integer currentInRoom;
    private Integer maxInRoom;
    private Integer totalInRoom;

    public static void main(String[] args) {

    new WarningCounter();

    RoomMonitor monitor = new RoomMonitor();

    monitor.toString();


    }
    public RoomMonitor(){
    }
    public void enterRoom(){
        super.count();
    }
    public void exitRoom(){
        super.uncount();
    }
    public Integer totalObjectsInRoom(){
    return 0;
    }
    public Integer maxObjectsInRoom(){
    return maximumIs();
    }
    public Integer currentObjectsInRoom(){
        return currentCount();
    }
    public String toString(){
        return ("");
    }


}
