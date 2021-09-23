public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Luiz", "Rua 0 Casa 2012", "1155555", 1000, 256);
        Colaborador colaborador = new Colaborador("Joao", "Quadra 01 Casa 02", "61-9-999-999-99", 102, 1369, 50);
        System.out.println(fornecedor.getNome());
        System.out.println(fornecedor.obterSaldo());
        System.out.println(colaborador.getNome());
        System.out.println(colaborador.calcularSalario());
    }
}
