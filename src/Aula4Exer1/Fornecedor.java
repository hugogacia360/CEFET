public class Fornecedor extends Pessoa {
    private double valorCredito, valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public double obterSaldo(){  //nao precisa de passa paremetros, metodo tem acesso direto as atributos da classe
        double value = valorCredito - valorDivida;
        return value;
    }
    
}
