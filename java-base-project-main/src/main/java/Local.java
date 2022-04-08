import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Local {

    public List<Venta> ventas = new ArrayList<Venta>();

    public void registrarVenta(Venta _venta){
        ventas.add(_venta);
    }

    public double gananciasSegunDia(LocalDate dia){
        List<Venta> ventasDelDia = ventas.stream().filter(x -> x.getFecha().isEqual(dia)).collect(Collectors.toList());
        double total = ventasDelDia.stream().mapToDouble(x ->x.ganancias()).sum();
        return total;
    }
}
