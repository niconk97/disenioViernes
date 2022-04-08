import java.time.LocalDate;
import java.util.List;

public class VentaTarjeta extends Venta{

    public int cantidadCuotas;
    public int coeficienteTarjeta;

    VentaTarjeta(LocalDate _fecha, List<Prenda> _prendasVendidas, int _coeficienteTarjeta, int _cantidadCuotas) {
        super(_fecha, _prendasVendidas);
        this.coeficienteTarjeta = _coeficienteTarjeta;
        this.cantidadCuotas = _cantidadCuotas;

    }

    public double ganancias(){
        double total = prendasVendidas.stream().mapToDouble(x -> x.precio()).sum();
        double recargo = (cantidadCuotas * coeficienteTarjeta) + (0.01 * total);
        return total + recargo;
    }

}
