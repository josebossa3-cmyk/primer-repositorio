package gestion_de_eventos;

import java.time.LocalDate;

public class Eventos {

    private String nombre;
    private LocalDate fecha;
    private String responsable;

    public Eventos(String nombre, LocalDate fecha, String responsable) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void Mostrar() {
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Fecha: " + fecha);
        System.out.println(" Responsable " + responsable);
    }

    @Override
    public String toString() {
        return "\n Nombre " + nombre + "\n Fecha " + fecha + "\n Responsable " + responsable;
    }

}
