package date;

public class Date {
  public int day;
  public int month;
  public int year;

  public Date(int d, int m, int y) {
    this.day = d;
    this.month = m;
    this.year = y;
  }

  @Override
  public String toString() {
    return this.month + "/" + this.day + "/" + this.year;
  }

  public Date nextDay() {
    int d = this.day + 1;
    int m = this.month;
    int y = this.year;

    if (d > daysInMonth(this.month)) {
      d = 1;
      m = m + 1;
      if (m > 12) {
        m = 1;
        y = y + 1;
      }
    }

    return new Date(d, m, y);
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
