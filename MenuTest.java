package padroesestruturaisteste_exercicios.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import padroesestruturais_exercicios.composite.Menu;
import padroesestruturais_exercicios.composite.MenuItem;

public class MenuTest {

    private Menu menu;

    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;

    @BeforeEach
    public void setUp() {
        item1 = new MenuItem("Item 1", () -> System.out.println("Item 1 selected"));
        item2 = new MenuItem("Item 2", () -> System.out.println("Item 2 selected"));
        item3 = new MenuItem("Item 3", () -> System.out.println("Item 3 selected"));

        menu = new Menu("Menu");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
    }

    @Test
    public void testMenuItem() {
        assertEquals("Item 1", item1.getLabel());
        item1.execute();
    }

    @Test
    public void testMenu() {
        assertEquals("Menu", menu.getLabel());
        assertEquals(3, menu.getComponents().size());
        assertTrue(menu.getComponents().contains(item1));
        assertTrue(menu.getComponents().contains(item2));
        assertTrue(menu.getComponents().contains(item3));
    }
}
