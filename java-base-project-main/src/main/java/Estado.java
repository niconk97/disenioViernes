public interface Estado {

    /*  Para el estado de una prenda pensé en una interface que
    *   es implementada por tres clases distintas (Nuevo, Promocion, Liquidacion)
    *
    *   Utilizando esto puedo seguir agregando distintos estados que puedan surgir en algun futuro
    *   y que posiblemente puedan tener una lógica distinta para calcular los precios y distintos atributos
    *  únicos para esa clase.
    *
    * */


    public double precioEstado(double precio);
}
