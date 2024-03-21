abstract class Addition{
abstract void add()
abstract void sub()
{
System.out.println("Subraction");
System.out.println("Addition");
}
}
abstract class ImplementedMethod extends Addition{
abstract void division()
abstract  void multipy()
{
System.out.println("Multiplication");
System.out.println("Division");
}
}
public class AbstractExample {
public static void main(String[] args) {
}
}
