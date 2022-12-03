# Main

This is a simple Java program that lets you create and manage a shopping list.

## Usage

To use the program, follow these steps:

1. Compile the code using `javac Main.java`.
2. Run the program using `java Main`.
3. The program will prompt you to enter a name for your shopping list.
4. Use the `addItem` method to add items to your shopping list.
5. Use the `markAsBought` method to mark items as bought.
6. Use the `toString` method to print your shopping list.

## Dependencies

This program requires Java to be installed on your system.

---

# Item Class

The `Item` class represents an item that can be bought. It has three attributes:

- `name`: a string that holds the name of the item
- `isBought`: a boolean that indicates whether the item has been bought or not
- `price`: a double that holds the price of the item

## Creating an Item

To create an `Item` object, use the `Item` constructor, which takes two arguments:

```java
Item(String name, double price)
```

Here's an example of creating an `Item` object:

```java
Item item = new Item("Apple", 0.99);
```

## Using the Item Class

The `Item` class has several methods that you can use to access and modify its attributes:

- `getName()`: returns the name of the item
- `isBought()`: returns whether the item has been bought or not
- `setBought(boolean isBought)`: sets the `isBought` attribute of the item
- `getPrice()`: returns the price of the item

Here's an example of using these methods:

```java
// Create an item
Item item = new Item("Apple", 0.99);

// Print the item
System.out.println(item); // Output: Apple - 0.99 €

// Check if the item has been bought
System.out.println(item.isBought()); // Output: false

// Buy the item
item.setBought(true);

// Check if the item has been bought
System.out.println(item.isBought()); // Output: true

// Print the item
System.out.println(item); // Output: Apple (acheté) - 0.99 €
```

## Dependencies

The `Item` class does not have any dependencies.

## Notes

- The `toString()` method returns a string representation of the `Item` object in the form `name (acheté) - price €`.
- The `isBought` attribute is set to `false` by default when an `Item` object is created.

---

# ShoppingList

La classe `ShoppingList` est une classe Java qui permet de gérer une liste de courses. Elle possède un nom pour la liste de courses et un `Map` d'objets `Item`, qui représentent les différents éléments de la liste de courses.

## Installation

Pour utiliser cette classe dans votre projet, vous devez d'abord ajouter les fichiers `ShoppingList.java` et `Item.java` à votre projet. Assurez-vous également d'importer les bibliothèques `java.util.Map` et `java.util.HashMap` dans votre code.

## Utilisation

Pour utiliser la classe `ShoppingList`, vous devez d'abord créer un nouvel objet de la classe en appelant le constructeur `ShoppingList(String name)`, en passant le nom de la liste de courses en paramètre. Vous pouvez ensuite utiliser les méthodes suivantes pour gérer la liste de courses :

- `addItem(Item item)` : ajoute un nouvel élément à la liste de courses.
- `markAsBought(Item item)` : marque un élément de la liste de courses comme acheté.
- `toString()` : retourne une chaîne de caractères représentant la liste de courses, avec les éléments de la liste affichés sous forme de liste.
- `getItems()` : retourne le `Map` d'éléments de la liste de courses.

Voici un exemple d'utilisation de la classe `ShoppingList` :

```java
ShoppingList list = new ShoppingList("Course de la semaine");
Item item1 = new Item("Lait");
Item item2 = new Item("Pain");
list.addItem(item1);
list.addItem(item2);
list.markAsBought(item1);
System.out.println(list);
```

Cet exemple crée une nouvelle liste de courses nommée "Course de la semaine", ajoute deux éléments à la liste, puis marque l'un d'entre eux comme acheté. Enfin, il affiche la liste de courses en utilisant la méthode `toString()`.

## Dépendances

Pour utiliser cette classe, vous devez avoir les bibliothèques suivantes dans votre projet :

- `java.util.Map`
- `java.util.HashMap`

## Ressources supplémentaires

Pour en savoir plus sur cette classe et son utilisation, consultez la documentation de la classe `ShoppingList` et de la classe `Item`. Vous pouvez également consulter d'autres exemples d'utilisation de cette classe sur notre page GitHub. Si vous rencontrez des problèmes ou si vous avez des questions, n'hésitez pas à ouvrir une issue sur notre page GitHub pour obtenir de l'aide.
