/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelBookings;

import Models.HotelRoom;

/**
 *
 * @author drifasoley
 */
public class Main {
    public static void main(String args[]) {
        SQLiteJDBC.createHotelRooms();
        SQLiteJDBC.insertIntoHotelRooms(1, "Hotel Bifrost","2017-01-01","2017-12-31",28000 , "double", "Family", 2, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(2, "Hotel Ísafjordur","2017-04-04","2017-08-21",34000 , "double", "Family", 3, "Vesturland");
        SQLiteJDBC.insertIntoHotelRooms(3, "Hotel Snæfell","2017-03-04","2017-09-04",21000 , "single", "Family", 2, "Austurlandi");
        SQLiteJDBC.insertIntoHotelRooms(4, "Hotel Snæfell","2017-03-04","2017-12-31",40000 , "double", "Family", 2, "Austurlandi");
        SQLiteJDBC.insertIntoHotelRooms(5, "Hotel Holt","2017-03-04","2017-12-31",90000 , "suite", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(6, "Hotel Holt","2017-03-04","2017-12-31",60000 , "double", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(7, "Hotel Holt","2017-03-04","2017-12-31",40000 , "single", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(8, "Hotel Borg","2017-02-06","2017-07-26",94000 , "suite", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(9, "Hotel Borg","2017-02-06","2017-09-04",64000 , "double", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(10, "Hotel Borg","2017-02-06","2017-09-04",44000 , "single", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(11, "Hotel Canopy","2017-02-06","2017-09-04",81647 , "suite", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(12, "Hotel Canopy","2017-02-06","2017-09-04",60389 , "double", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(13, "Hotel Canopy","2017-04-05","2017-08-15",45890 , "single", "Family", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(14, "Hotel Frón","2017-04-05","2017-09-04", 77000, "suite", "Family", 3, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(15, "Hotel Frón","2017-04-05","2017-09-04",55400 , "double", "Family", 3, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(16, "Hotel Frón","2017-04-05","2017-09-04",33500 , "single", "Family", 3, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(17, "Hotel KEA","2017-04-05","2017-12-31",45792 , "double", "Family", 4, "Norðurland");
        SQLiteJDBC.insertIntoHotelRooms(18, "Hotel KEA","2017-04-05","2017-12-31",36700 , "single", "Family", 4, "Norðurland");
        SQLiteJDBC.insertIntoHotelRooms(19, "Hotel Mývatn","2017-02-06","2017-12-31",26700, "double", "Family", 3, "Norðurland");
        SQLiteJDBC.insertIntoHotelRooms(20, "Hotel Mývatn","2017-02-06","2017-12-31",19200 , "single", "Family", 3, "Norðurland");
        SQLiteJDBC.insertIntoHotelRooms(21, "Hotel Kjarnalundur","2017-02-06","2017-12-31",39000, "double", "Family", 2, "Norðurland");
        SQLiteJDBC.insertIntoHotelRooms(22, "Hotel Icelandair", "Akureyri","2017-02-06",47000, "double", "Family", 3, "Norðurland");
        SQLiteJDBC.insertIntoHotelRooms(23, "Hotel Eskifjördur","2017-01-01","2017-12-31",22000 , "double", "Family", 2, "Austurland");
        SQLiteJDBC.insertIntoHotelRooms(24, "Hotel Selfoss","2017-04-04","2017-08-21",18126 , "double", "Family", 4, "Suðurland");
        SQLiteJDBC.insertIntoHotelRooms(25, "Hotel Selfoss","2017-04-04","2017-08-21",50085 , "suite", "Family", 4, "Suðurland");
        SQLiteJDBC.insertIntoHotelRooms(26, "Hotel Holt","2017-03-04","2017-12-31",90000 , "suite", "Buisness", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(27, "Hotel Holt","2017-03-04","2017-12-31",60000 , "double", "Buisness", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(28, "Hotel Holt","2017-03-04","2017-12-31",40000 , "single", "Buisness", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(29, "Hotel Borg","2017-02-06","2017-07-26",94000 , "suite", "Buisness", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(30, "Hotel Borg","2017-02-06","2017-09-04",64000 , "double", "Buisness", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(32, "Hotel Canopy","2017-02-06","2017-09-04",81647 , "suite", "Romantic", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(33, "Hotel Canopy","2017-02-06","2017-09-04",60389 , "double", "Romantic", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(34, "Hotel Canopy","2017-04-05","2017-08-15",45890 , "single", "Romantic", 4, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(35, "Hotel Bifrost","2017-01-01","2017-12-31",28000 , "double", "Romantic", 2, "Sudurland");
        SQLiteJDBC.insertIntoHotelRooms(36, "Hotel Selfoss","2017-04-04","2017-08-21",18126 , "double", "Romantic", 4, "Suðurland");
        SQLiteJDBC.insertIntoHotelRooms(37, "Litlabýli","2017-04-04","2017-08-21",13789 , "double", "Romantic", 2, "Vesturland");
        SQLiteJDBC.insertIntoHotelRooms(38, "Litlabýli","2017-04-04","2017-08-21",13789 , "double", "Family", 2, "Vesturland");
        HotelRoom model = SQLiteJDBC.getHotelForId(1);
        //HotelRoom model2 = SQLiteJDBC.getHotelForId(2);
        
        model.dump();
        //model2.dump();
    }
}
