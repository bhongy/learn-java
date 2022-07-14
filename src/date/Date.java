package date;

public class Date {
  public int day;
  public int month;
  public int year;

  public Date(int m, int d, int y) {
    this.day = d;
    this.month = m;
    this.year = y;
  }

  public String toString() {
    return this.month + "/" + this.day + "/" + this.year;
  }

  public void nextDay() {
    this.day++;
    if (this.day > daysInMonth(this.month)) {
      this.day = 1;
      this.month++;
      if (this.month > 12) {
        this.month = 1;
        this.year++;
      }
    }
  }

  int daysInMonth(int month) {
    switch (month) {
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        if (isLeapYear(this.year)) {
          return 29;
        } else {
          return 28;
        }
      default:
        return 31;
    }
  }

  boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
  }
}
