package com.sda.model;

public class Room {

    private int number;
    private int size;
    private boolean bathroom;
    private boolean available = true;

    private static int nextNumber = 1;

    public Room(int size, boolean bathroom) {
        number = nextNumber;
        this.size = size;
        this.bathroom = bathroom;
        nextNumber++;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", size=" + size +
                ", bathroom=" + bathroom +
                ", available=" + available +
                '}';
    }
}
