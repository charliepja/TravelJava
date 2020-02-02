public enum PlaneType {
    BOEING747(400, 10000),
    BOEING757(500, 15000),
    AIRBUS245(700, 7500);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

}
