package services;

public final class Moto extends Veiculo{
    private String tipoDeCombustivel;

    public Moto(String modelo, String placa, String ano, double precoDiaria, String tipoDeCombustivel) {
        super(modelo, placa, ano, precoDiaria);
        setTipoDeCombustivel(tipoDeCombustivel);
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        if(tipoDeCombustivel == null || tipoDeCombustivel.trim().isEmpty()) {
            System.out.println("O tipo de gasolina não pode ser nulo ou vazio.");
        } else {
            this.tipoDeCombustivel = tipoDeCombustivel;
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Moto:{" +
                            "\n     Modelo: " + modelo +
                            "\n     Placa: " + placa +
                            "\n     Ano: " + ano +
                            "\n     Preço da diária: " + precoDiaria +
                            "\n     Tipo de combustivel: " + tipoDeCombustivel +
                            "\n }\n");
    }

    @Override
    public void calcularCusto(int dias) {
        if (dias > 5){
            System.out.println("Custo total de "+ dias + " dia(s): " + (precoDiaria * dias * 0.97));
        }else{
            System.out.println("Custo total de "+ dias + " dia(s): " + (precoDiaria * dias));
        }
    }
}
