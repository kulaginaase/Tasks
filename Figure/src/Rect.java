public class Rect implements Figure {
    int sideA;
    int sideB;
    String name;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rect(int sideA, int sideB, String name) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.name = name;
    }


    @Override
    public int perimeter() {
        return  (sideA + sideB) * 2;
    }

    @Override
    public int square() {
        return sideA * sideB;
    }

    @Override
    public String name() {
        return name;
    }
}
