package de.iad.ef.RoomMonitorApp;

import de.iad.ef.model.WarningCounter;

public class RoomMonitor  {

    private Integer currentInRoom;
    private Integer maxInRoom=0;
    private Integer totalInRoom=0;
    private WarningCounter TheCounter;

    public static void main(String[] args) {

        RoomMonitor Tester = new RoomMonitor();
        Tester.enterRoom();
        Tester.exitRoom();
        Tester.enterRoom();



        System.out.println(Tester.toString());



    }
    public RoomMonitor(){
        TheCounter=new WarningCounter(0,Integer.MAX_VALUE);

    }
    public void enterRoom(){
        TheCounter.count();
        totalInRoom=totalInRoom +1;
        if (currentObjectsInRoom() >= maxObjectsInRoom()) {
            maxInRoom=currentObjectsInRoom();
        }
    }
    public void exitRoom(){
        TheCounter.uncount();
    }
    public Integer totalObjectsInRoom(){
    return totalInRoom;
    }
    public Integer maxObjectsInRoom(){
    return maxInRoom;
    }
    public Integer currentObjectsInRoom(){
        return TheCounter.currentCount();
    }
    public String toString(){
        return ("Im Raum befinden sich zur Zeit   " + currentObjectsInRoom() + "\n"+
                "maximale Anzahl gleichzeiteiger personen   "+ maxObjectsInRoom()+"\n"+
                "Summe aller Personen im raum ist   "+ totalObjectsInRoom()+"\n") ;
    }


}
