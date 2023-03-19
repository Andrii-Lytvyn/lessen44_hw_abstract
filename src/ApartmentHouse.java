public class ApartmentHouse extends House {
  int entrance;

  public ApartmentHouse(String address, int entrance) {
    super(address);
    this.entrance = entrance;
  }

  @Override
  public String toString() {
    return "Адрес дома: " + address + ". В нем " + entrance + " подъездов.";
  }

  @Override
  public void destroy() {
    System.out.printf("Вы снесли многоквартирный дом на %d подъездов", entrance);
  }
}
