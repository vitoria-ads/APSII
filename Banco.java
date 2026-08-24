public class Banco {
    public String nome;
    public String cpf;
    public double saldo;
    public String setNome;

    public Banco (String novoNome, String novoCpf, double novoSaldo){
        this.nome = novoNome;
        this.cpf = novoCpf;
        this.saldo = novoSaldo;
    }
    public Banco (){
        this.setNome("Sem nome");
        this.cpf = "sem cpf";
        this.saldo = 0;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}
