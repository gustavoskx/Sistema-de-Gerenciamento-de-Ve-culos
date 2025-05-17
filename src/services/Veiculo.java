package services;

public abstract class Veiculo {
    protected String modelo;
    protected String placa;
    protected String ano;
    protected double precoDiaria;

    public Veiculo(String modelo, String placa, String ano, double precoDiaria) {
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setPrecoDiaria(precoDiaria);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isEmpty()) {
            System.out.println("O modelo não pode ser nulo ou vazio.");
        } else {
            this.modelo = modelo;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa == null || placa.isEmpty()) {
            System.out.println("A placa não pode ser nula ou vazia.");
        } else {
            this.placa = placa;
        }
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        if (ano == null || ano.isEmpty()) {
            System.out.println("O ano não pode ser nulo ou vazio.");
        } else {
            this.ano = ano;
        }
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria > 0) {
            this.precoDiaria = precoDiaria;
        } else {
            System.out.println("O preço da diária deve ser maior que zero.");
        }
    }

    public abstract void mostrarDados();
    public abstract double calcularCusto(int dias);
}
