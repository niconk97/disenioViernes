import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
*   Se agrega una clase llamada "Local" que en el ejercicio simula ser la tienda macowins
*
*   Esta clase permite registrar ventas e informar las ganancias para un dia
*   indicado por el usuario
*
* */


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
