package services;

public final class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String modelo, String placa, String ano, double precoDiaria, int numeroPortas) {
        super(modelo, placa, ano, precoDiaria);
        setNumeroPortas(numeroPortas);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        if(numeroPortas > 0 && numeroPortas <= 6) {
            this.numeroPortas = numeroPortas;
        } else {
            System.out.println("O número de portas deve ser entre 1 e 6.");
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Carro:{" +
                            "\n     Modelo: " + modelo +
                            "\n     Placa: " + placa +
                            "\n     Ano: " + ano +
                            "\n     Preço da diária: " + precoDiaria +
                            "\n     Número de portas: " + numeroPortas +
                            "\n }\n");
    }

    @Override
    public void calcularCusto(int dias) {
        if (dias > 10){
            System.out.println("Custo total de "+ dias + " dia(s): "+ (precoDiaria * dias * 0.95));
        }else{
            System.out.println("Custo total de "+ dias + "dia(s): "+ (precoDiaria * dias));
        }
    }
}
