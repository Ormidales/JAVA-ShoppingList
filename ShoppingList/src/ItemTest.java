import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItemTest {
  @Test
  public void testGetName() {
    Item item = new Item("apple", 1.99);
    assertEquals("apple", item.getName());
  }

  @Test
  public void testIsBought() {
    Item item = new Item("apple", 1.99);
    assertFalse(item.isBought());
    item.setBought(true);
    assertTrue(item.isBought());
  }

  @Test
  public void testGetPrice() {
    Item item = new Item("apple", 1.99);
    assertEquals(1.99, item.getPrice(), 0.001);
  }

  @Test
  public void testToString() {
    Item item = new Item("apple", 1.99);
    assertEquals("apple - 1.99 €", item.toString());
    item.setBought(true);
    assertEquals("apple (acheté) - 1.99 €", item.toString());
  }
}

