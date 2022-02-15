package com.engeto.hotel;
import java.util.ArrayList;
public class Bookings {
    ArrayList<Booking> bookings = new ArrayList<Booking>();

    public void addBooking (Booking newBooking) {
        bookings.add(newBooking);
    }
    public void AllBookings () {
        for (Booking booking : bookings) {
            System.out.println(booking.getDescription());
        }
    }

}
