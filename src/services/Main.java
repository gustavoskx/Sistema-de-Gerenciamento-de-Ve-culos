package services;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Fusca", "ABC-1234", "1970", 100.0, 2);
        carro.mostrarDados();
        System.out.println("Custo para 12 dias: " + carro.calcularCusto(12) + "\n");

        Moto moto = new Moto("Honda", "XYZ-5678", "2020", 50.0, "Gasolina");
        moto.mostrarDados();
        System.out.println("Custo para 3 dias: " + moto.calcularCusto(3) + "\n");
    }
}