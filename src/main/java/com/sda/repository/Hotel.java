package com.sda.repository;

import com.sda.model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public Hotel(){
        //reczne robienie
       /* rooms.add(new Room(1,false));
        rooms.add(new Room(1,false));
        rooms.add(new Room(2,true));
        rooms.add(new Room(2,false));
        rooms.add(new Room(2,false));
        rooms.add(new Room(2,false));
        rooms.add(new Room(3,true));
        rooms.add(new Room(3,true));
        rooms.add(new Room(3,false));*/

        //generowanie
        int size = 1;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0 && i!= 0) {
                size++;
            }
            rooms.add(new Room(size,random.nextBoolean()));
        }

        System.out.println(rooms);
    }

}
