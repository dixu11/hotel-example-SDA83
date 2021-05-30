package com.sda.service;

import com.sda.exception.RoomUnaviableException;
import com.sda.model.Room;
import com.sda.repository.Hotel;

import java.util.List;

public class HotelService {

    private Hotel hotel;

    public HotelService(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Room> getAllRooms() {
        return hotel.getRooms();
    }

    public List<Room> getAvailableRooms() {
        return hotel.getAvailableRooms();
    }

    public void reserveRoom(int number) throws RoomUnaviableException {
        Room room = hotel.findRoomByNumber(number);
        if (!room.isAvailable()) {
            throw new RoomUnaviableException();
        }
        room.reserve();
    }
}
