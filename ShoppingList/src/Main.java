// Classe principale
public class Main {
  public static void main(String[] args) {
    // Création d'une nouvelle liste de courses
    ShoppingList list = new ShoppingList("Course de la semaine");
    
    // Création d'éléments
    Item bread = new Item("Pain", 1.50);
    Item milk = new Item("Lait", 0.75);
    Item eggs = new Item("Oeufs", 2.00);
    Item playstation4 = new Item("Playstation 4", 350.00);
    
    // Ajout d'éléments à la liste de courses
    list.addItem(bread);
    list.addItem(milk);
    list.addItem(eggs);
    list.addItem(playstation4);
    
    // Marquer un élément comme acheté
    list.markAsBought(milk);
    
    // Affichage de la liste de courses
    System.out.println(list);
  }
}
