public class Pantalon extends Prenda{

    Pantalon(Estado _estado, double _precioBase) {
        super(_estado, _precioBase);
    }

    @Override
    public double precio(){
        return this.estado.precioEstado(precioBase);
    }
}
