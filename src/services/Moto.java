package services;

public final class Moto extends Veiculo{
    private String tipoDeGasolina;

    public Moto(String modelo, String placa, String ano, double precoDiaria, String tipoDeGasolina) {
        super(modelo, placa, ano, precoDiaria);
        setTipoDeGasolina(tipoDeGasolina);
    }

    public String getTipoDeGasolina() {
        return tipoDeGasolina;
    }

    public void setTipoDeGasolina(String tipoDeGasolina) {
        if(tipoDeGasolina == null || tipoDeGasolina.trim().isEmpty()) {
            System.out.println("O tipo de gasolina não pode ser nulo ou vazio.");
        } else {
            this.tipoDeGasolina = tipoDeGasolina;
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Moto:{" +
                            "\n     Modelo: " + modelo +
                            "\n     Placa: " + placa +
                            "\n     Ano: " + ano +
                            "\n     Preço da diária: " + precoDiaria +
                            "\n     Tipo de gasolina: " + tipoDeGasolina +
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
