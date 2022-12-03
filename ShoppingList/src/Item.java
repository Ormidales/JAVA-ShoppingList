// Classe Item
public class Item {
  // Attributs
  private String name;
  private boolean isBought;
  private double price;
  
  // Constructeur
  public Item(String name, double price) {
    this.name = name;
    this.isBought = false;
    this.price = price;
  }
  
  // Getters et setters
  public String getName() { return name; }
  public boolean isBought() { return isBought; }
  public void setBought(boolean isBought) { this.isBought = isBought; }
  public double getPrice() { return price; }
  
  // Méthode toString()
  @Override
  public String toString() {
    return name + (isBought ? " (acheté)" : "") + " - " + price + " €";
  }
}
