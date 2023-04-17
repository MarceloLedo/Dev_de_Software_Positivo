class Venda {
    private double valor;
    private int dia;
    private int mes;
    private int ano;

    public Venda(double valor, int dia, int mes, int ano) {
        this.valor = valor;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}

