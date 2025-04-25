import java.util.Scanner;

public class ClasseSistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClasseCliente cliente = new ClasseCliente();
        ClasseFornecedora fornecedor = new ClasseFornecedora();
        ClasseProduto produto = new ClasseProduto();
        ClasseUsuario usuario = new ClasseUsuario();

        //Atributos Do Objeto Cliente
        System.out.println("Cadastre o cliente: ");
        cliente.nome=sc.nextLine();

        System.out.println("Cadastre o CPF: ");
        cliente.cpf=sc.nextLine();

        System.out.println("Escreva sua classe social: ");
        cliente.razaoSocial=sc.nextLine();

        System.out.println("Digite o fornecedor: ");
        fornecedor.estoque=sc.nextInt();

        System.out.println("Digite o produto escolhido: ");
        cliente.nome=sc.nextLine();

        System.out.println("Valor do produto: ");
        produto.preco=sc.nextFloat();

        System.out.println("Digite a senha para comfirmar a compra: ");
        usuario.senha=sc.nextLine();
        


    }
}
