public class Cube {
    private int mLength;
    public Cube(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        mLength = length;
    }
    public Cube() {
        mLength = 1;
    }
    public int getSide() {
        return mLength;
    }
    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        mLength = side;
    }
    public int getVolume() {
        return mLength*mLength*mLength;
    }
    public int getSurfaceArea() {
        return mLength*mLength*6;
    }
    @Override
    public String toString() {
        return "Cube{side=" + mLength + "}";
    }

}
