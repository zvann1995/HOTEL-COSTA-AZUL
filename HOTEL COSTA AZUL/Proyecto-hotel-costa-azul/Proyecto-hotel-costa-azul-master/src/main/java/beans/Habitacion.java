
package beans;


public class Habitacion {
   private int id_habitacion;
   private String categoria;
   private String descripcion;       
   private String estado;

    public Habitacion(int id_habitacion, String categoria, String descripcion, String estado) {
        this.id_habitacion = id_habitacion;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "id_habitacion=" + id_habitacion + ", categoria=" + categoria + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
   
   
}
