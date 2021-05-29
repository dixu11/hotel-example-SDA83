package com.sda;

import com.sda.model.Room;
import com.sda.repository.Hotel;
import com.sda.service.HotelService;

import java.util.List;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        HotelService service = new HotelService(hotel);

        System.out.println("Co chcesz zrobić?");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Wyświetl pokoje");
        System.out.println("2. Wyświetl dostępne pokoje");
        int decision = scanner.nextInt();

        switch (decision) {
            case 1:
                System.out.println("Wszystkie pokoje: ");
                showRooms(service.getAllRooms());
                break;
            case 2:
                System.out.println("Dostępne pokoje:");
                showRooms(service.getAvailableRooms());
                break;
        }
    }

    public static void showRooms(List<Room> rooms) {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

}

