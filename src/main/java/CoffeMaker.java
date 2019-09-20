public class CoffeMaker {
    Heater heater = new Heater();
    Pump pump = new Pump(heater);

    public void brew() {
      heater.on();
      pump.pump();
      System.out.println(" [_]P coffee! [_]P ");
      heater.off();
    }
}
