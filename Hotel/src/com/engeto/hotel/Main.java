package com.engeto.hotel;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Guest Adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3,13));
        Guest Jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5,5));

        System.out.println(Adela.getDescription());
        System.out.println(Jan.getDescription());

        Room room1 = new Room(1, 1, YesNo.YES, YesNo.YES, 1000);
        Room room2 = new Room(2,1,YesNo.YES, YesNo.YES, 1000);
        Room room3 = new Room(3,3,YesNo.NO,YesNo.YES,2400);

        System.out.println(room1.getDecscription());
        System.out.println(room2.getDecscription());
        System.out.println(room3.getDecscription());

        Bookings bookings = new Bookings();
        Booking booking = new Booking(Adela, room1, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26), TypeOfStay.RECREATIONAL);

        bookings.addBooking(booking);
        booking = new Booking(Adela, room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfStay.WORKING);
        booking.addGuests(Jan);
        bookings.addBooking(booking);
        bookings.AllBookings();



    }
}
