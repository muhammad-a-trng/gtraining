package com.galvanize.oop;

import java.util.ArrayList;

public class GuestList {

    private String guest;
    private ArrayList<String> guests = new ArrayList<>();

    public void addGuest(String guest) {
        guests.add(guest);
        this.guest = guest;
    }

    public String getGuest() {
        return guest;
    }


    public ArrayList<String> getGuests() {
        return new ArrayList<>(guests);
    }

    public void setGuests(ArrayList<String> guests) {
        this.guests = guests;
    }

}
