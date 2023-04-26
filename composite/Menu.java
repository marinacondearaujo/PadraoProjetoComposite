package padroesestruturais_exercicios.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    private String label;
    private List<MenuComponent> components;

    public Menu(String label) {
        this.label = label;
        components = new ArrayList<MenuComponent>();
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    public void remove(MenuComponent component) {
        components.remove(component);
    }

    public MenuComponent getChild(int index) {
        return components.get(index);
    }

    public void execute() {
        System.out.println("Executing Menu: " + label);
        for (MenuComponent component : components) {
            component.execute();
        }
    }

    public String getLabel() {
        return this.label;
    }

    public List<MenuComponent> getComponents() {
        return this.components;
    }
}
