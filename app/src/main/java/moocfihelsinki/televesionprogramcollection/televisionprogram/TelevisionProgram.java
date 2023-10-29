package moocfihelsinki.televesionprogramcollection.televisionprogram;

public class TelevisionProgram {
    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration){
        this.duration = duration;
        this.name = name;
    }

    public int getDuration() {
        return duration;
    };

    public String getName() {
        return name;
    }
}
