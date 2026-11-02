package cl.dsy1102.ejemplos.herencia;

public class Jefatura extends Empleado  {

    /* Atributos */
    private int personasACargo;

    /*Constructor*/
    public Jefatura(String rut, String nombre, int sueldoBase, int personasACargo) {
        super(rut,nombre,sueldoBase);
        setPersonasACargo(personasACargo);
    }

    /*Getters n Setters*/
    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo) {
        if (personasACargo > 1 && personasACargo < 50) {
            this.personasACargo = personasACargo;
        } else {
            throw new IllegalArgumentException("La cantidad debe estar entre 1 y 50");
        }
    }

    /*Métodos Propios*/
    public int calcularAsignacion() {
        return (int) Math.round(getSueldoBase() * 0.15) + (10000 * personasACargo);
    }

    /*Métodos Heredados */
    @Override
    public int calcularSueldo() {
        return (int) Math.round(getSueldoBase());
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + " | A cargo: N | Asignación: $" + calcularAsignacion();
    }
}