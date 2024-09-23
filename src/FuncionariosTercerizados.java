public class FuncionariosTercerizados extends Funcionario {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public FuncionariosTercerizados(String nome, int horasTrabalhadas, double valorHora) {
        super(nome, horasTrabalhadas, valorHora);

    }

    public FuncionariosTercerizados() {

    }

    @Override
    public double pagamento() {

        double valorAdc = this.bonus * 1.10;
        double valorPagamento = ((getHorasTrabalhadas() * getValorHora()) + valorAdc);
        return valorPagamento;

    }

    @Override
    public String toString() {
        return "" + getNome() +
                " - " + " $ " +
                pagamento();

    }

}
