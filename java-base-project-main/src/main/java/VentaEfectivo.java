import java.time.LocalDate;
import java.util.List;

public class VentaEfectivo extends Venta{
    VentaEfectivo(LocalDate _fecha, List<Prenda> _prendasVendidas) {
        super(_fecha, _prendasVendidas);
    }

    @Override
    public double ganancias() {
        double total = prendasVendidas.stream().mapToDouble(x -> x.precio()).sum();
        return total;
    }
}
