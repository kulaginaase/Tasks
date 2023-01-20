public class Square implements Figure {
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

    public Square(int side, String name) {
        this.side = side;
        this.name = name;
    }

    @Override
    public int perimeter() {
        return side * 4;
    }

    @Override
    public int square() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public String name() {
        return name;
    }
}
