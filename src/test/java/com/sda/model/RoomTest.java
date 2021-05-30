package com.sda.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {


    @Test
    public void new_room_should_be_available() {
        //given
        //when
        Room room = new Room(1,true);
        //than
        //assertEquals(true, room.isAvailable());
        assertTrue(room.isAvailable());
    }





}
