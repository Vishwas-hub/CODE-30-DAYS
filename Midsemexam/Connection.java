package com.company.Midsemexam;
import java.util.*;

public class Connection {
    private Device sourceDevice;
    private Device targetDevice;
    public int connectionID;
    private static int count = 0;
    public String name;

    public Connection(Device sourceDevice, Device targetDevice){
        this.sourceDevice = sourceDevice;
        this.targetDevice = targetDevice;
        count++;
        this.name=sourceDevice.name;
        connectionID = count;
        System.out.println(count+ " identity created\n"+" name :-" + name);
    }
    public Connection(Wearable sourceDevice, Wearable targetDevice){
        this.sourceDevice = sourceDevice;
        this.targetDevice = targetDevice;
        count++;
        this.name=sourceDevice.name;
        connectionID = count;
        System.out.println(count+ " identity created\n"+" name :-" + name);
    }

    @Override
    public String toString() {
        return "Connection{" +
                "sourceDevice=" + sourceDevice +
                ", targetDevice=" + targetDevice +
                ", connectionID=" + connectionID +
                '}';
    }

    public int compareTo(Connection other){
        if(this.sourceDevice == other.sourceDevice &&
                this.targetDevice == other.targetDevice &&
                this.connectionID == other.connectionID) return 1;
        else
            return 0;

    }

}
