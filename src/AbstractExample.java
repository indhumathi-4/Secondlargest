abstract class Addition {
    abstract void add();
    public void sub() {
        System.out.println("Subtraction");
    }
}

abstract class ImplementedMethod extends Addition {
    abstract void division();
    public void multiply() {
        System.out.println("Multiplication");
    }
}

class AbstractExample {
    public static void main(String[] args) {
        ImplementedMethod obj = new ImplementedMethod() {
            @Override
            void add() {
                System.out.println("Addition");
            }

            @Override
            void division() {
                System.out.println("Division");
            }
        }
        obj.add();
        obj.sub();
        obj.multiply();
        obj.division();
    }
}

