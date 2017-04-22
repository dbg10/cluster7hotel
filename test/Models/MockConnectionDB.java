/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.HotelRoom;
import Models.HotelRoom;
import Models.HotelRoom;
import java.net.ConnectException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class MockConnectionDB {

    public MockConnectionDB() {
        
    }
    public ArrayList<HotelRoom> getMatchingHotelsFromDB(String query) throws ConnectException{
        ArrayList<HotelRoom> hotel_list = new ArrayList<HotelRoom>();
        HotelRoom hotel1 = new HotelRoom (1, "Hotel Akureyri" ,47000, "2017-02-06" ,"2017-10-31" , "double", "Buisness", 5, "Suðurland");
        HotelRoom hotel2 = new HotelRoom (1, "Hotel Holt" ,49000, "2017-02-06" ,"2017-10-31" , "single", "Family", 3, "Norðurland");
        HotelRoom hotel3 = new HotelRoom (1, "Hotel Snæfell" ,40000, "2017-02-06" ,"2017-10-31" , "suite", "Romantic", 4, "Norðurland");
   
        hotel_list.add(hotel1);
        hotel_list.add(hotel2);
        hotel_list.add(hotel3);
    
        return hotel_list;
    }

    private static interface QueryDB {
    }

    public class MockConnectException implements QueryDB{
    
        public ArrayList<HotelRoom> getMatchingHotelsFromDB(String query) throws ConnectException{
           throw new ConnectException();
        }   
    }    
}