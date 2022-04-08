import java.time.*;
import java.util.List;
import java.util.stream.DoubleStream;

public abstract class Venta {

    public LocalDate fecha;
    public List<Prenda> prendasVendidas;

    Venta(LocalDate _fecha, List<Prenda> _prendasVendidas) {
        this.prendasVendidas = _prendasVendidas;
        this.fecha = _fecha;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public List<Prenda> getPrendasVendidas(){
        return prendasVendidas;
    }

    public abstract double ganancias();

    public int cantidadVendido(){
        return (int) prendasVendidas.stream().count();
    }

}
