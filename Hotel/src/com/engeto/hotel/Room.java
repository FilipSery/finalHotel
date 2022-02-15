package com.engeto.hotel;
public class Room {
    private int numberOfRoom;
    private int numberOfBeds;
    private YesNo isBalcony;
    private YesNo seaView;
    private int pricePerNight;

    public Room (int numberOfRoom, int numberOfBeds, YesNo isBalcony, YesNo seaView, int pricePerNight) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;

    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public YesNo isBalcony() {
        return isBalcony;
    }

    public void setBalcony(YesNo balcony) {
        this.isBalcony = balcony;
    }

    public YesNo isSeaView() {
        return seaView;
    }

    public void setSeaView(YesNo seaView) {
        this.seaView = seaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    public String getDecscription () {
        return "Room number: "+ numberOfRoom + ", number of beds: " + numberOfBeds + ", balcony: "+ isBalcony + ", sea view: " + seaView + ", price per night: " + pricePerNight + " Kč/night.";
    }
}