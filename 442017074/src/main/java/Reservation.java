/*
Name: Khalid Ahmad Helayhel
Student ID:442017074
Section:173
Lab Exam 1
 */
public class Reservation {
 protected String customerName;
 private Date date;
 private int duration=1;
 protected static int reservationNo;
 public Reservation(String customerName,Date date ){
     this.customerName=customerName;
     this.date=date;
     reservationNo++;    
 }
 public Reservation(String customerName,Date date, int duration){
     this.customerName=customerName;
     this.date=date;
     this.duration=duration;
     reservationNo++;
 }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String toString(){
      return String.format("Reservation [ Name=%s, Date=%s, Duration=%d, Reservation \n" +
       "Number=%d]",customerName,date,duration,reservationNo);
    }
 
}
