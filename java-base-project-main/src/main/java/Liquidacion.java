public class Liquidacion implements Estado{

    @Override
    public double precioEstado(double precio) {
        return precio*0.5;
    }
}
