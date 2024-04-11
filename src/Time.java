public class Time implements Comparable<Time>{
    int hours, minuts, seconds;

    public Time(int hours, int minuts, int seconds) {
        this.hours = hours;
        this.minuts = minuts;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minuts=" + minuts +
                ", seconds=" + seconds +
                '}';
    }

    @Override
    public int compareTo(Time t1) {
        int t2 = t1.getHours();
        return this.getHours() - t2;
    }
//    public int compareTo(Time t1){
//
//        return this.getHours().compareTo(t.getHours());
//    }

}


