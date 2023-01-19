public class MyBox {
    /**
     * Создать ArrayList
     * 1.	Создать ArrayList, содержащий объекты MyBox. (Объект MyBox имеет поля вес, высота, широта, глубина)
     * 2.	Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
     * 3.	Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
     */

    double weight;
    double height;
    double depth;
    double width;

    public MyBox(double weight, double height, double depth, double width) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
        this.width = width;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
