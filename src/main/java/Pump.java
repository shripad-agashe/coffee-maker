public class Pump {
  private final Heater heater;

  Pump(Heater heater) {
    this.heater = heater;
  }

  public void pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
    }
  }
}
