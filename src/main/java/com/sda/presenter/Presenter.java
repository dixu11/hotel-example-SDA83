package com.sda.presenter;

import com.sda.exception.RoomUnaviableException;
import com.sda.model.Room;
import com.sda.service.HotelService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Presenter {

    private HotelService service;
    private Scanner scanner = new Scanner(System.in);

    public Presenter(HotelService service) {
        this.service = service;
    }

    public void startMenu() {
        do {
            int decision = askForOption();
            executeOption(decision);
        } while (true);
    }

    private int askForOption() {
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Wyświetl pokoje");
        System.out.println("2. Wyświetl dostępne pokoje");
        System.out.println("3. Zarezerwuj pokój");
        int decision = scanner.nextInt();
        return decision;
    }

    private void executeOption(int decision) {
        switch (decision) {
            case 1:
                System.out.println("Wszystkie pokoje: ");
                showRooms(service.getAllRooms());
                break;
            case 2:
                System.out.println("Dostępne pokoje:");
                showRooms(service.getAvailableRooms());
                break;
            case 3:
                try {
                    System.out.println("Który pokój chcesz zarezerwować?");
                    int number = scanner.nextInt();
                    service.reserveRoom(number);
                    System.out.println("Zarezerwowałeś pokój");
                }catch (NoSuchElementException e){
                    System.out.println("Nie ma pokoju o takim numerze");
                }catch (RoomUnaviableException e){
                    System.out.println("Pokój już zajęty");
                }
        }
    }

    private void showRooms(List<Room> rooms) {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

}
