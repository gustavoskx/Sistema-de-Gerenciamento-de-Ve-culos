package services;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Fusca", "ABC-1234", "1970", 100.0, 2);
        carro.mostrarDados();
        carro.calcularCusto(13);

        System.out.println();

        Moto moto = new Moto("Honda", "XYZ-5678", "2020", 50.0, "Gasolina");
        moto.mostrarDados();
        moto.calcularCusto(12);

        System.out.println();

        Carro carro2 = new Carro("Civic", "DEF-5678", "2020", 150.0, 4);
        carro2.mostrarDados();
        carro2.calcularCusto(3);
    }
}