package object_methods;

public class House implements Cloneable {
    public static int COUNT = 0;
    private String streetName;
    private int number;
    private Door door;

    public House(String streetName, int number) {
        this.streetName = streetName;
        this.number = number;
    }

    public House(String streetName, int number, Door door) {
        this.streetName = streetName;
        this.number = number;
        this.door = door;
    }

    public House(House house) {
        this.streetName = house.streetName;
        this.number = house.number;
        this.door = new Door(house.door.getName());
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void f() {
    }

    public void g() {
    }

    @Override
    public String toString() {
        return "House{" +
                "streetName='" + streetName + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        this.door = new Door(this.door.getName());
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm die, help me...");
        COUNT++;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        House house = (House) obj;

        if (number != house.number) return false;

        if (streetName != null) {
            if (!streetName.equals(house.streetName)) {
                return false;
            }
        } else {
            if (house.streetName != null) {
                return false;
            }
        }
        return door != null ? door.equals(house.door) : house.door == null;
    }
}
