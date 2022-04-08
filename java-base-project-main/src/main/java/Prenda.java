public abstract class Prenda {

    /*  Para la prenda hice una clase abstracta donde sus atributos y algunos metodos son reutilizados en tres clases
        hijas : Camisa, Saco y Pantalon
    *
    * */

    public Estado estado;
    public double precioBase;

    Prenda(Estado _estado, double _precioBase){
        this.estado = _estado;
        this.precioBase = _precioBase;
    }


    public double getPrecioBase() {
        return 0;
    }

    public abstract double precio();
}


