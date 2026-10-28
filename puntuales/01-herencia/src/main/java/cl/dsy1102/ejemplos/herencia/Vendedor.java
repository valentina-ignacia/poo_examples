package cl.dsy1102.ejemplos.herencia;

import java.util.Locale;

public class Vendedor extends Empleado {

    /*Atributo agregado*/
    private int ventasMes;

    /* Constructor */
    public Vendedor(String rut, String nombre, int sueldoBase, int ventasMes) {
        super(rut,nombre,sueldoBase);
        setVentasMes(ventasMes);
    }

    /* Getter n Setters*/
    public void setVentasMes(int vestasMes) {
        if (ventasMes < 0) {
            throw new IllegalArgumentException("Las ventas del mes no puede ser negativas.");
        }
        this.ventasMes = vestasMes;
    }

    public int getVentasMes() {
        return ventasMes;
    }
}

