package date;

public class Main {
  public static void main(String[] args) {
    Date d = new Date(31, 7, 2022);
    System.out.println("Today is " + d);
    System.out.println("Tomorrow is " + d.nextDay());
  }
}
