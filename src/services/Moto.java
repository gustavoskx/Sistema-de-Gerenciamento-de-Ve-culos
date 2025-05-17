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
        this.tipoDeGasolina = tipoDeGasolina;
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
    public double calcularCusto(int dias) {
        if (dias > 5){
            return  precoDiaria * dias * 0.97;
        }
        return precoDiaria * dias;
    }
}
