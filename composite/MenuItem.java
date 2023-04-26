package padroesestruturais_exercicios.composite;

public class MenuItem implements MenuComponent {
    private String label;
    private Runnable command;

    public MenuItem(String label, Runnable command) {
        this.label = label;
        this.command = command;
    }

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException("Menu Item cannot add components");
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException("Menu Item cannot remove components");
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException("Menu Item has no child components");
    }

    public void execute() {
        command.run();
    }

    public String getLabel() {
        return this.label;
    }


}
