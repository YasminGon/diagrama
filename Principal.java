public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Yasmin",17);
        Gerente gerente = new Gerente("Joao",2000,"17");
        Vendedor vendedor = new Vendedor("Lunna",2000,17);

        System.out.println("Nome do Empregado: " + empregado.getEmpregado());
        System.out.println("Valor do Salario: " + empregado.getEmpregado());
        System.out.println("Nome do Vendedor: " + vendedor.getVendedor());

        System.out.println("Salario do Vendendor: " + vendedor.getVendedor());
        System.out.println("Percentual de Comissao do Vendendor: " + vendedor.getVendedor());
        System.out.println("Nome do Vendendor: " + gerente.getGerente());

        System.out.println("Salario do Gerente: " + gerente.getGerente());
        System.out.println("Departamento do Gerente: " + gerente.getGerente());
    

        
    }
}