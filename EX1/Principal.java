public class Principal {

    public static void main(String[] args){
        Banco b1 = new Banco("Vitória", "0012", 11);
        Banco b2 = new Banco();
        Banco b3 = new Banco("Maria", "0023", 12); //criar

        System.out.println(b1.saldo);
        System.out.println(b2.saldo);
        b2.saldo = 1000;
        System.out.println(b2.saldo);
        System.out.println(b3.nome); //mostrar
        b3.setNome = "Vivi"; //atualizar
        System.out.println(b3.nome); //mostrary

    }
}

