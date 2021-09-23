public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Luiz", "Rua 0 Casa 2012", "55-111-111-111", 1000, 256);
        Colaborador colaborador = new Colaborador("Joao", "Quadra 01 Casa 02", "61-9-999-999-99", 102, 1369, 50);
        Administrador adm = new Administrador("Pedro", "Qs 16 cj 10 cs 15", "55-55-999-999-995",236, 5000, 300, 500);

        System.out.println(fornecedor.getNome());
        System.out.println(fornecedor.obterSaldo());
        System.out.println(colaborador.getNome());
        System.out.println(colaborador.calcularSalario());
        System.out.println(adm.getNome());
        System.out.println(adm.calcularSalario());

    }
}
