public class Camisa extends Prenda{

    //String tipo = "Camisa";

    Camisa(Estado _estado, double _precioBase) {
        super(_estado, _precioBase);
    }

    @Override
    public double precio(){
        return this.estado.precioEstado(precioBase);
    }
}
