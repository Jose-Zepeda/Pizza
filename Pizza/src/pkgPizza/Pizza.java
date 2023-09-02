package pkgPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    //Constructor

    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        this.price = price;
        for (Topping to : toppings) {
            this.toppings.add(to);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    @Override
    public String toString() {
        return "Pizza{" + "name=" + name + ", price=" + price;
    }

    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void prepare() {
        System.out.println("Preparando la pizza:" + name);
        System.out.println("Agregando los ingredientes:");
        for (Topping topping : toppings) {
            System.out.println("- "+topping.getName());

            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        System.out.println("Pizza lista!");
    }

    public void calcularPrecioTotal(){
        double precioTotal = 0;
        if (toppings != null){
            for (Topping ingrediente : toppings) {

                precioTotal += ingrediente.getPrecio();
            }
            precioTotal = precioTotal + price;
            if (precioTotal > 0)
            {
                System.out.println("El costo a pagar es: " + precioTotal);
            }
        }
    }
}
