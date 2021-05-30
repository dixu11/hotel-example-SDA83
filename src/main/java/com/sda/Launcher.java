package com.sda;

import com.sda.model.Room;
import com.sda.presenter.Presenter;
import com.sda.repository.Hotel;
import com.sda.service.HotelService;

import java.util.List;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        HotelService service = new HotelService(hotel);
        Presenter presenter = new Presenter(service);
        presenter.startMenu();
    }



}

