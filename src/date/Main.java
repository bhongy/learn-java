package date;

public class Main {
  public static void main(String[] args) {
    Date d = new Date(7, 31, 2022);
    System.out.println("Today is " + d);

    d.nextDay();
    System.out.println("Tomorrow is " + d);
  }
}
