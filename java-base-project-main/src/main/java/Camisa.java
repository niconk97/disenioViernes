public class Camisa extends Prenda{

    Camisa(Estado _estado, double _precioBase) {
        super(_estado, _precioBase);
    }

    @Override
    public double precio(){
        return this.estado.precioEstado(precioBase);
    }

}
