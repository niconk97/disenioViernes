public class Promocion implements Estado{

    private double descuento;

    Promocion(double _descuento){
        this.descuento = _descuento;
    }

    @Override
    public double precioEstado(double precio) {
        return precio - descuento;
    }
}
