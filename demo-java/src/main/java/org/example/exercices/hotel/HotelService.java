package org.example.exercices.hotel;



public interface HotelService {
    //utilisation ds HOTEL
    default void addClient(String firstName, String lastName, String phone){};

    //utilisation HOTEL et CLIENT
    public void addReservation(Reservation reservation);
}
