/**
 * @author Oleh Fliurkevych
 */
public class Task1 {

  public static void main(String[] args) {
    System.out.println(add(3, 4));
    System.out.println(sub(3, 5));
    System.out.println(sub(5, 2));
    System.out.println(div(10, 2));
    System.out.println(multi(8, 7));
    System.out.println(multi(5, 6));
    System.out.println(sqrt(6));
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int sub(int a, int b) {
    if (a > b) {
      return a - b;
    } else {
      return b - a;
    }
  }

  public static int div(int a, int b) {
    if (b == 0) {
      return 0;
    } else {
      return a / b;
    }
  }

  public static int multi(int a, int b) {
    return a * b;
  }

  public static double sqrt(int b) {
    return Math.sqrt(b);
  }

}
