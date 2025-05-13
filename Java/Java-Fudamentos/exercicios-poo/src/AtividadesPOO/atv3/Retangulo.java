package AtividadesPOO.atv3;

public class Retangulo extends FormaGeometrica {
    double base;
    double altura;

//    Constructor
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
