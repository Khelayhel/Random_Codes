/*
Name: Khalid Ahmad Helayhel
Student ID:442017074
Section:173
Lab Exam 1
 */
public class PackageReservation extends Reservation{
    private String extras;
    
    public PackageReservation(String customerName,Date date,String extras){
        super(customerName, date);
        this.extras=extras;
    }

    public PackageReservation(String customerName, Date date, int duration,String extras) {
        super(customerName, date, duration);
        this.extras=extras;
    }
    @Override
    public String toString(){
     return String.format("%s Extras=%s",super.toString(),extras);
    }
    
}
