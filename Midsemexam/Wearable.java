package com.company.Midsemexam;

public class Wearable extends Device{
    private int wearableID;
    private static int count = 0;
    public String name;

    public Wearable(String name){
        count++;
        wearableID = count;
        this.name = name;
    }

    @Override
    public int compareTo(Device device){
        if (this.compareTo(device) == 1 && this.name == device.name){
            return 0;
        }
        else
            return 1;
    }

    public boolean compareToWearables   (Wearable device){
        return this.compareTo(device) == 1 && this.name == device.name;
    }

}