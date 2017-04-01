/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author drifasoley
 */
public class HotelRoom {
    public int id;
    public String hotelName;
    public int price;
    public String fromAvailability;
    public String toAvailability;
    public String type;
    public String theme;
    public int quality;
    public String location;
    
    public HotelRoom(int id, String hotelName, int price, String fromAvailability, String toAvailability, String type, String theme, int quality, String location) {
        this.id = id;
        this.hotelName = hotelName;
        this.price = price;
        this.fromAvailability = fromAvailability;
        this.toAvailability = toAvailability;
        this.type = type;
        this.theme = theme;
        this.quality = quality;
        this.location = location;
    }
    
    public void dump() {
        System.out.println("id: " + this.id);
        System.out.println("hotelName: " + this.hotelName);
        System.out.println("price: " + this.price);
        System.out.println("availability from: " + this.fromAvailability);
        System.out.println("availability to: " + this.toAvailability);
        System.out.println("type: " + this.type);
        System.out.println("theme: " + this.theme);
        System.out.println("quality: " + this.quality);
        System.out.println("location: " + this.location);
        
    }
    public int getId() {
        return id;
    }
    public String getHotelName() {
        return hotelName;
    }
    public int getPrice() {
        return price;
    }
    public String getFromAvailability() {
        return fromAvailability;
    }
    public String getToAvailability() {
        return toAvailability;
    }
    public String getType() {
        return type;
    }
    public String getTheme() {
        return theme;
    }
    public int getQuality() {
        return quality;
    }
    public String getLocation() {
        return location;
    }
    
}


