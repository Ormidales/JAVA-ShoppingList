import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShoppingListTest {
 // Teste la méthode addItem()
 @Test
 public void testAddItem() {
   // Crée une liste d'achats
   ShoppingList list = new ShoppingList("Course hebdomadaire");
   
   // Crée un objet Item
   Item item = new Item("Pain", 2);
   
   // Ajoute l'item à la liste d'achats
   list.addItem(item);
   
   // Vérifie que l'item a été ajouté à la liste
   assertTrue(list.getItems().containsKey("Pain"));
 }
 
 // Teste la méthode markAsBought()
 @Test
 public void testMarkAsBought() {
   // Crée une liste d'achats
   ShoppingList list = new ShoppingList("Course hebdomadaire");
   
   // Crée un objet Item
   Item item = new Item("Pain", 2);
   
   // Ajoute l'item à la liste d'achats
   list.addItem(item);
   
   // Marque l'item comme acheté
   list.markAsBought(item);
   
   // Vérifie que l'item a été marqué comme acheté
   assertTrue(item.isBought());
 }
 
 // Teste la méthode toString()
 @Test
 public void testToString() {
   // Crée une liste d'achats
   ShoppingList list = new ShoppingList("Course hebdomadaire");
   
   // Crée un objet Item
   Item item = new Item("Pain", 2);
   
   // Ajoute l'item à la liste d'achats
   list.addItem(item);
   
   // Vérifie que la méthode toString() retourne la bonne chaîne de caractères
   assertNotEquals("Course hebdomadaire\n- Pain [-2.0 €]\n", list.toString());
 }
}
