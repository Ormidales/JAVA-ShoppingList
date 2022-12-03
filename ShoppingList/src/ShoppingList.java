import java.util.HashMap;
import java.util.Map;

//Classe ShoppingList
public class ShoppingList {
	// Attributs
	private String name;
	private Map<String, Item> items;
	
	// Constructeur
	public ShoppingList(String name) {
	 this.name = name;
	 this.items = new HashMap<>();
	}
	
	// Méthode addItem()
	public void addItem(Item item) {
	 items.put(item.getName(), item);
	}
	
	// Méthode markAsBought()
	public void markAsBought(Item item) {
	 item.setBought(true);
	}
	
	// Méthode toString()
	@Override
	public String toString() {
	 StringBuilder sb = new StringBuilder();
	 sb.append(name).append("\n");
	 for (Item item : items.values()) {
	   sb.append("- ").append(item).append("\n");
	 }
	 return sb.toString();
	}

	// Méthode getItems()
	public Map<String, Item> getItems() {
	  return this.items;
	}
}
