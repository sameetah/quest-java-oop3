public class Eagle extends Bird implements Fly{

    private  boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public String sing() {
        return "Screech!";
    }

    public void takeOff() {
        this.flying=true;
        System.out.println(this.getName()+ " takes off in the sky");
    }

    public int ascend(int meters) {
        if (this.flying) {
            this.altitude += meters;
            System.out.printf(this.getName()+" flies upwards, altitude: "+this.altitude);
        }
        return this.altitude;
    }

    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 1);
            System.out.printf(this.getName()+" flies downward, altitude: "+this.altitude);
        }
        return altitude;
    }

    public void land() {
        if (this.flying && (this.altitude <=9)) {
            System.out.printf(this.getName()+ " lands on the ground");
        } else {
            System.out.printf(this.getName()+ " is too high, it cant land");
        }
    }

}
