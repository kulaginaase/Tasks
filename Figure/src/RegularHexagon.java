public class RegularHexagon {
    int side;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public RegularHexagon(int side, String name) {
        this.side = side;
        this.name = name;
    }
}
