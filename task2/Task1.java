/**
 * @author Oleh Fliurkevych
 */
public class Task1 {

  public static void main(String[] args) {
    System.out.println(add(3, 4));
  }

  public static int add(int a, int b) {
    System.out.println("This add method for 2 params");
    return a + b;
  }

  public static int add(int a, int b, int c) {
    System.out.println("This add method for 3 params");
    return a + b + c;
  }

  public static int add(int a, int b, int c, int d) {
    System.out.println("This add method for 4 params");
    return a + b + c + d;
  }

}
