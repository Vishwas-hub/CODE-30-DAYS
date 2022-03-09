package com.company.Midsemexam;
import java.util.*;
public class Connections {
        private final List<Connection> connectionList;

        public Connections(){
                this.connectionList = new ArrayList<>();

        }

        public void setNetworkList(Connection connection){
                connectionList.add(connection);

        }
        public Connection specificConnection (String id) {
                for (int i = 0; i<5; i++) {
                        Connection Vishwas = connectionList.get(i);
                        if(Vishwas.name.equalsIgnoreCase(id)){
                                System.out.println("Connection found in");
                                System.out.println(" Connection name is " +Vishwas.name+ " And connection is " +Vishwas.connectionID);
                        }
                }
                return null;
        }
}
