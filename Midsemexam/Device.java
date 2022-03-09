package com.company.Midsemexam;

public class Device {
    private final int deviceID = count;
    private static int count = 0;
    public String name;

    public Device() {
        count++;
    }


    @Override
    public String toString() {
        return "Device{" +
                "deviceID=" + deviceID +
                '}';
    }

    public int compareTo(Device other){
        if (this.deviceID == other.deviceID) return 1;
        else
            return 0;
    }

}
