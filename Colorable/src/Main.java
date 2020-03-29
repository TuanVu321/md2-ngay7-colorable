public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square(1, "blue", true);
        shape[1] = new Rectangle(2, 3, "black", false);
        shape[2] = new Square(3, "yeallow", false);
        Square square = new Square();
        for (Shape value : shape) {
            System.out.println(value);
            if (value instanceof Square) {
                value.howToColor();
            }
        }
    }
}

