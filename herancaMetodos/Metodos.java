
import java.util.Scanner;

public class Metodos {
    
    public String nome;
    public String telefone;
    public String cpf;
    public int numero;

    //Metodo Imprimir Atributos

    void imprimirAtributos(){

        Scanner sc = new Scanner(System.in);

        System.out.println
        (" Digite o nome: ");
        this.nome=sc.nextLine();

        System.out.println("Digite o telefone: ");
        this.telefone=sc.nextLine();

        System.out.println("Digite o CPF: ");
        this.cpf=sc.nextLine();

        System.out.println("Digite o numero: ");
        this.numero=sc.nextInt();

        System.out.println(this.nome + " " + this.telefone + " " + this.cpf + " " + this.numero);

    }

}
