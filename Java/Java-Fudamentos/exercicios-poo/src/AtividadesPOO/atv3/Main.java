package AtividadesPOO.atv3;

public class Main {
    public static void main(String[] args) {
       Retangulo retangulo = new Retangulo(4,6);
       Triangulo triangulo = new Triangulo(5,4);
       Circulo circulo = new Circulo(3);

        System.out.println(circulo.calcularArea());
        System.out.println(triangulo.calcularArea());
        System.out.println(retangulo.calcularArea());

    }
}
