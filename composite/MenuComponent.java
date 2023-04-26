package padroesestruturais_exercicios.composite;

public interface MenuComponent {
    public void add(MenuComponent component);
    public void remove(MenuComponent component);
    public MenuComponent getChild(int index);
    public void execute();
}
