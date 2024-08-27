
/*
Name: Khalid Ahmad Helayhel
Student ID:442017074
Section:173
Lab Exam 1
 */
public class ReservationTest {
    public static void main(String[] args){
        Reservation r1 = new Reservation("Khalid",new Date(2,5,2012));
        Reservation r2 = new Reservation("Mohammed",new Date(26,6,2009),6);
        PackageReservation p1= new PackageReservation("Omar",new Date(10,10,2010),7,"Put Fruits");
        p1.setDuration(2);
        System.out.println(p1);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        
        
    }
   
}
