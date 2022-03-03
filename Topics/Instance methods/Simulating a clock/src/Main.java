class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        this.minutes++;
        
        if (this.minutes > 59) {
            this.hours++;
            this.minutes = 0;
        }
        
        if (this.hours > 12) {
            this.hours = 1;
        }
    }
    /*
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        clock1.hours = 12;
        clock1.minutes = 0;
        //System.out.println("time is " + clock1.hours + ":" + clock1.minutes);
        printTime(clock1);
        clock1.next(); // from 12:00 to 12:01
        //System.out.println("time is " + clock1.hours + ":" + clock1.minutes);
        printTime(clock1);
    
        Clock clock2 = new Clock();
        clock2.hours = 10;
        clock2.minutes = 59;
        //System.out.println("time is " + clock2.hours + ":" + clock2.minutes);
        printTime(clock2);
        clock2.next(); // from 10:59 to 11:00
        //System.out.println("time is " + clock2.hours + ":" + clock2.minutes);
        printTime(clock2);
    }
    
    public static void printTime(Clock clock) {
        if (clock.minutes < 10) {
            System.out.println("time is " + clock.hours + ":0" + clock.minutes);
        } else {
            System.out.println("time is " + clock.hours + ":" + clock.minutes);
        }
    }
    */
}