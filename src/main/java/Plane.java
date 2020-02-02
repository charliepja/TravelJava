public class Plane {
    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public String getPlaneName() {
        return this.planeType.toString();
    }

    public int getPlaneCapacity() {
        return this.planeType.getCapacity();
    }

    public int getPlaneTotalWeight() {
        return this.planeType.getTotalWeight();
    }
}
