import models.Subject;

public class main {
  public static void main(String[] args) {
    Subject s = new Subject("1", "calculo", 5, "TA-3");
    System.out.println(s.get_code());
    System.out.println(s.get_name());
  }
}
