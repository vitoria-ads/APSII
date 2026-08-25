public class Gerente extends FuncionarioCLT {

    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao,
                    double valeTransporte, double valeAlimentacao,
                    int tamanhoEquipe, double percentualBonus) {
        // chama o construtor da classe FuncionarioCLT
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    @Override
    public double calcularSalario() {
        // pega o calculo de FuncionarioCLT e soma o bonus
        double bonus = getSalarioBase() * percentualBonus;
        return super.calcularSalario() + bonus;
    }

    @Override
    public double calcularDesconto() {
        // pega o desconto de FuncionarioCLT
        double desconto = super.calcularDesconto();

        // se a equipe tiver mais de 10 pessoas, soma 100 reais
        if (tamanhoEquipe > 10) {
            desconto = desconto + 100;
        }

        return desconto;
    }
}
