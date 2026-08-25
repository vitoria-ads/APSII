public class Estagiario extends Funcionario {

    private double valorBolsaAuxilio;
    private int cargaHorariaSemanal;

    public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao,
                       double valorBolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public double getValorBolsaAuxilio() {
        return valorBolsaAuxilio;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    @Override
    public double calcularSalario() {
        // o salario do estagiario e o valor da bolsa auxilio
        return valorBolsaAuxilio;
    }

    @Override
    public double calcularDesconto() {
        // estagiario nao tem desconto
        return 0;
    }
}
