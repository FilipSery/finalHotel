package com.engeto.hotel;
import java.util.ArrayList;
import java.time.LocalDate;

public class Booking {
    private ArrayList<Guest> otherGuests = new ArrayList<>();
    private Guest mainGuest;
    private Room room;
    private LocalDate begining;
    private LocalDate end;
    private TypeOfStay typeOfStay;

    public Booking(Guest mainGuest, Room room, LocalDate begining, LocalDate end, TypeOfStay typeOfStay) {
        this.mainGuest = mainGuest;
        this.room = room;
        this.begining = begining;
        this.end = end;
        this.typeOfStay= typeOfStay;

    }
    public Guest getMainGuest() {
        return mainGuest;
    }
    public void setMainGuest (Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public void addGuests(Guest newGuest) {
        otherGuests.add(newGuest);
    }
    public void removeGuests(Guest guest) {
        otherGuests.remove(guest);
    }
    public void clearGuests(Guest guest) {
        otherGuests.clear();
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getBegining() {
        return begining;
    }

    public void setBegining(LocalDate begining) {
        this.begining = begining;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public TypeOfStay getTypeOfStay() {
        return typeOfStay;
    }

    public void setTypeOfStay(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }
    public String getDescription() {

        String reserv = "Booking for: " + mainGuest.getFullName() + ", ";
        for (Guest guest : otherGuests) {
            reserv += guest.getFullName() + ", ";
        }
        String reservation = reserv + "number of room: " + room.getNumberOfRoom() + ", type of stay: " + getTypeOfStay() + ", date: from " + getBegining() + ", to " + getEnd() +".";
        return reservation;
    }

}
