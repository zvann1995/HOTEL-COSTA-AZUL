
package beans;

import java.sql.Date;


public class Reserva {
  
    private int id_reserva;
    private int id_habitacion;
    private String username;
    private Date fecha_ingreso;      
    private Date fecha_salida;       
    private String servicio_adicional;
    private String forma_pago;
    private double valor;

    public Reserva(int id_reserva, int id_habitacion, String username, Date fecha_ingreso, Date fecha_salida, String servicio_adicional, String forma_pago, double valor) {
        this.id_reserva = id_reserva;
        this.id_habitacion = id_habitacion;
        this.username = username;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.servicio_adicional = servicio_adicional;
        this.forma_pago = forma_pago;
        this.valor = valor;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getServicio_adicional() {
        return servicio_adicional;
    }

    public void setServicio_adicional(String servicio_adicional) {
        this.servicio_adicional = servicio_adicional;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id_reserva=" + id_reserva + ", id_habitacion=" + id_habitacion + ", username=" + username + ", fecha_ingreso=" + fecha_ingreso + ", fecha_salida=" + fecha_salida + ", servicio_adicional=" + servicio_adicional + ", forma_pago=" + forma_pago + ", valor=" + valor + '}';
    }
    
    
}
