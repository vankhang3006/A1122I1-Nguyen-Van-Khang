public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int Speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        Speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String result;
        if (this.isOn()) {
            result = this.color + " - " + this.radius + "fan is off";
        } else {
            result = this.Speed + " - " + this.color + " - " + this.radius + "fan is on";
        }
        return result;
    }
}
