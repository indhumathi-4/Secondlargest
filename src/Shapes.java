
class Shapes {
    public int perimeter() {
        return 0;
    }
}

class Circle extends Shapes {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // override
    @Override
    public int perimeter() {
        return (int) (2 * Math.PI * radius);
    }
}

class Square extends Shapes {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    // override
    @Override
    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle extends Shapes {
    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // override
    @Override
    public int perimeter() {
        return 2 * (length + width);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 5);

        System.out.println("Perimeter of Circle: " + circle.perimeter());
        System.out.println("Perimeter of Square: " + square.perimeter());
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
    }
}
