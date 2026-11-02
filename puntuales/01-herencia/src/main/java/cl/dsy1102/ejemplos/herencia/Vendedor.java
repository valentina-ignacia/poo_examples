package cl.dsy1102.ejemplos.herencia;

public class Vendedor extends Empleado {

    /* Atributo agregado */
    private int ventasMes;

    /* Constructor */
    public Vendedor(String rut, String nombre, int sueldoBase, int ventasMes) {
        super(rut, nombre, sueldoBase);
        setVentasMes(ventasMes);
    }

    /* Getters y Setters */
    public void setVentasMes(int ventasMes) {
        if (ventasMes < 0) {
            throw new IllegalArgumentException(
                    "Las ventas del mes no pueden ser negativas."
            );
        }
        this.ventasMes = ventasMes;
    }

    public int getVentasMes() {
        return ventasMes;
    }

    /* Metodos propios */
    public int calcularComision() {
        return (int) Math.round(ventasMes * 0.03);
    }

    /* Metodos heredados */
    @Override
    public int calcularSueldo() {
        return super.calcularSueldo() + calcularComision();
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle()
                + " | Comision: " + pesos(calcularComision());
    }
}