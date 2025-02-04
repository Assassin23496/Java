package E11.zad3;

public class Vechicle implements Comparable<Vechicle>{
    private String model;
    private int speed;

    public Vechicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int compareTo(Vechicle o){
        return Double.compare(this.speed,o.speed);
    }
    public String toString(){
        return "model: " + model + " , speed: " + speed;
    }
}
