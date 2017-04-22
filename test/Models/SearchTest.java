/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drifasoley
 */
public class SearchTest {
    
    private ArrayList<HotelRoom> list;
    
    @Before
    public void setUp() {
        try {
            MockConnectionDB conn = new MockConnectionDB();
            list = conn.getMatchingHotelsFromDB("");
        } catch (Exception e) {
        }
    }
    
    @After
    public void tearDown() {
        list = null;
    }

    /**
     * Test of ListUsers method, of class Search.
     */
    @Test
    public void testHotelSearch() {
        System.out.println("ListUsers");
        String ValToSearch = "Holt";
        
        ArrayList<HotelRoom> testList = list;
        testList.removeIf(hotel -> !hotel.hotelName.contains(ValToSearch));
        
        assertNotNull(testList);
        assertFalse(testList.isEmpty());
        for (HotelRoom item : testList) {
            assert(item.hotelName.contains(ValToSearch));
        }
    }
    
    /**
     * Test of ListUsers method, of class Search.
     */
    @Test
    public void testHotelSearchFailure() {
        System.out.println("ListUsers");
        String ValToSearch = "saldkalskdmalskm";
        
        ArrayList<HotelRoom> testList = list;
        testList.removeIf(hotel -> !hotel.hotelName.contains(ValToSearch));
        
        
        assertNotNull(testList);
        assert(testList.isEmpty());
    }
    
    /**
     * Test of ListLocation method, of class Search.
     */
    @Test
    public void testLocationSearch() {
        System.out.println("ListLocation");
        String ValToSearch = "Suðurland";
        
        ArrayList<HotelRoom> testList = list;
        testList.removeIf(hotel -> !hotel.location.contains(ValToSearch));
        
        assertNotNull(testList);
        assertFalse(testList.isEmpty());
        for (HotelRoom item : testList) {
            assert(item.location.contains(ValToSearch));
        }
    }
    
    /**
     * Test of ListLocation method, of class Search.
     */
    @Test
    public void testLocationSearchFailure() {
        System.out.println("ListLocation");
        String ValToSearch = "kdakansdlkasd";
        
        ArrayList<HotelRoom> testList = list;
        testList.removeIf(hotel -> !hotel.location.contains(ValToSearch));
        
        assertNotNull(testList);
        assert(testList.isEmpty());
    }

    /**
     * Test of ListType method, of class Search.
     */
    @Test
    public void testTypeSearch() {
        System.out.println("ListType");
        String ValToSearch = "single";
        
        ArrayList<HotelRoom> testList = list;
        testList.removeIf(hotel -> !hotel.type.contains(ValToSearch));
        
        assertNotNull(testList);
        assertFalse(testList.isEmpty());
        for (HotelRoom item : testList) {
            assert(item.type.contains(ValToSearch));
        }
    }
    
    /**
     * Test of ListType method, of class Search.
     */
    @Test
    public void testTypeSearchFailure() {
        System.out.println("ListType");
        String ValToSearch = "laksmdalsmd";
        
        ArrayList<HotelRoom> testList = list;
        testList.removeIf(hotel -> !hotel.type.contains(ValToSearch));
        
        assertNotNull(testList);
        assert(testList.isEmpty());
    }
    
}
