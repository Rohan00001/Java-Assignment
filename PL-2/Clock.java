public class Clock {
    int hour;
    int minutes;
    
    // Constructor to initialize the clock
    public Clock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }
    
    // Method to read time
    public void readTime(int h, int m) {
        hour = h;
        minutes = m;
    }
    
    // Method to show time
    public void showTime() {
        System.out.println("Time: " + hour + " hours " + minutes + " minutes");
    }
    
    public static void main(String[] args) {
        Clock clock1 = new Clock(10, 30);
        Clock clock2 = new Clock(12, 45);
        
        clock1.showTime();
        clock2.showTime();
        
        int differenceHours = Math.abs(clock1.hour - clock2.hour);
        int differenceMinutes = Math.abs(clock1.minutes - clock2.minutes);
        
        System.out.println("Time Difference: " + differenceHours + " hours " + differenceMinutes + " minutes");
    }
}