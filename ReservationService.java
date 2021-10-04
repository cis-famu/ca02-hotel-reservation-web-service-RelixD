/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca02hotelreservation.Service;

import com.mycompany.ca02hotelreservation.Reservation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.jws.WebService;

/**
 *
 * @author Relo's PC
 */
@WebService
public class ReservationService {
   private ArrayList<Reservation> list = new ArrayList<>();
   
   public ReservationService(){ 
 
   }


// Get a reservation by confirmationNum
   public Reservation findbyconfirmationNumber(int confirmationNumber){
     for(Reservation reserve : list){
         if(reserve.getConfirmationNumber() == confirmationNumber)
             return reserve;
     }
     return null;
 }
   //Get all reservations by customerId
   public ArrayList<Reservation> findBycustomerId(int customerId){
    
    ArrayList<Reservation> resultList = new ArrayList<>();
    
    for(Reservation reserve : list){
         if(reserve.getCustomerId() == customerId)
             resultList.add(reserve);
}
    return resultList;
}
   // Get all reservations completed within a data range
   
   // Gell all reservations after a checkin date
   public ArrayList<Reservation> findbySubmittedDate(Date checkIn){
     ArrayList<Reservation> returnList = new ArrayList<>();
   
           for(int i = 0; i < list.size(); ++i)
   {
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       String objDate = formatter.format(list.get(i).getCheckIn());
       
       if(objDate.compareTo(formatter.format(checkIn)) == 0)
           returnList.add(list.get(i));
   }
   
         return null;
   }
   // Get all reservations by payment status
   
   
   // Get all reservations by platform
    public ArrayList<Reservation> findByplatform(String platform){
    
    ArrayList<Reservation> resultList = new ArrayList<>();
    
    for(Reservation reserve : list){
         if(reserve.getPlatform() == platform)
             resultList.add(reserve);
}
    return resultList;
    }
}