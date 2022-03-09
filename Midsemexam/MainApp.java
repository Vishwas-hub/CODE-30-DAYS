package com.company.Midsemexam;

public class MainApp {

public static void main (String[]args){

    Wearable wear1 = new Wearable( "Headphone");
    Wearable wear2 = new Wearable( "laptop");
    Wearable wear3 = new Wearable( "Watch");
    Wearable wear4 = new Wearable( "Mobile-phone");
    Wearable wear5 = new Wearable( "Earphone");
    Wearable wear6 = new Wearable( "Computer");

    Connections con = new Connections();
    Connection con1 = new Connection(wear1,wear2);
    Connection con2 = new Connection(wear1,wear3);
    Connection con3 = new Connection(wear1,wear4);
    Connection con4 = new Connection(wear1,wear5);
    Connection con5 = new Connection(wear1,wear6);

    con.setNetworkList((con1));
    con.setNetworkList((con2));
    con.setNetworkList((con3));
    con.setNetworkList((con4));
    con.setNetworkList((con5));

    con.specificConnection("Headphone");
    con.specificConnection("laptop");
}
}
