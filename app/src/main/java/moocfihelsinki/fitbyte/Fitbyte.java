package moocfihelsinki.fitbyte;

public class Fitbyte {
    private int restingHeartRate;
    private int age;

    public Fitbyte(int age, int restingHeartRate){
        this.restingHeartRate = restingHeartRate;
        this.age = age;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;

    }
}
