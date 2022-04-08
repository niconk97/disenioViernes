import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("hola mundo");

        Nuevo nuevo = new Nuevo();
        Promocion promocion300pesos = new Promocion(300);
        Liquidacion liquidacion = new Liquidacion();

        Saco sacoNuevo = new Saco(nuevo, 2000);
        Saco sacoPromo = new Saco(promocion300pesos, 1250);
        Camisa camisaLiquidacion = new Camisa(liquidacion, 3000);

        List<Prenda> listaDePrendas = new ArrayList<Prenda>();

        listaDePrendas.add(sacoNuevo);
        listaDePrendas.add(sacoPromo);
        listaDePrendas.add(camisaLiquidacion);

        VentaEfectivo unaVentaEnEfectivo = new VentaEfectivo(LocalDate.now(), listaDePrendas);

        //System.out.println(unaVentaEnEfectivo.ganancias());

        Local macowins = new Local();

        macowins.registrarVenta(unaVentaEnEfectivo);

        System.out.println(macowins.gananciasSegunDia(LocalDate.now()));

    }
}
