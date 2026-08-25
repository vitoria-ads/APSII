public class FuncionarioCLT extends Funcionario {

    private double valeTransporte;
    private double valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao,
                           double valeTransporte, double valeAlimentacao) {
        // chama o construtor da classe Funcionario
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    @Override
    public double calcularSalario() {
        // salario base (vindo de Funcionario) + os dois beneficios
        return super.calcularSalario() + valeTransporte + valeAlimentacao;
    }

    @Override
    public double calcularDesconto() {
        // mantem o desconto de Funcionario e soma 50 reais
        return super.calcularDesconto() + 50;
    }
}
