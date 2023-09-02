package pkgPizza;

import java.util.ArrayList;

public class Topping {
    private String name;
    private ArrayList<String> ingredientes = new ArrayList<>();
    private double precio;
    public void addIngredientes(String ingrediente){
        this.ingredientes.add(ingrediente);
    }

    //Constructor
    public Topping(String name, double precio) {
        this.name = name;
        this.precio = precio;
     }

     public double getPrecio(){
         return precio;
     }

     @Override
    public String toString() {
            return "Topping{" + "Nombre:" + name + ", Ingredientes:" + ingredientes + '}';
        }

    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }


}

