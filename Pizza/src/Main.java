import pkgPizza.Pizza;
import pkgPizza.Topping;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Margarita", 100);
        pizza.addTopping(new Topping("Tomate", 10));
        pizza.addTopping(new Topping("Cebolla", 5));
        pizza.addTopping(new Topping("Peperoni", 15));
        pizza.addTopping(new Topping("Queso", 20));
        pizza.prepare();
        pizza.calcularPrecioTotal();
    }
}