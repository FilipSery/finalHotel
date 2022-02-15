package com.engeto.hotel;
import java.time.LocalDate;
public class Guest {
    private String guestName;
    private String guestSurname;
    private LocalDate guestDateOfBirth;

    public Guest(String guestName, String guestSurname, LocalDate guestDateOfBirth) {
        this.guestName = guestName;
        this.guestSurname = guestSurname;
        this.guestDateOfBirth = guestDateOfBirth;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestSurname() {
        return guestSurname;
    }
    public String getFullName () {
        return guestName + " "+ guestSurname;
    }

    public void setGuestSurname(String guestSurname) {
        this.guestSurname = guestSurname;
    }

    public LocalDate getGuestDateOfBirth() {
        return guestDateOfBirth;
    }

    public void setGuestDateOfBirth(LocalDate guestDateOfBirth) {
        this.guestDateOfBirth = guestDateOfBirth;
    }
    public String getDescription () {
        return "Name of the guest: " + guestName + " " + guestSurname + ", date of birth: " + guestDateOfBirth + ".";
    }
}
