import java.util.Scanner;

public class Heranca {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ClasseMae mae = new ClasseMae();
        ClasseFilho filho = new ClasseFilho();
        ClasseFilha filha = new ClasseFilha();

        System.out.println("Digite o nome da Mae: ");
        mae.nome=sc.nextLine();

        System.out.println("Digite a idade: ");
        mae.idade=sc.nextInt();

        System.out.println("Digite o ano de nascimaento: ");
        mae.ano=sc.nextInt();

        mae.cpf=sc.nextLine();
        System.out.println("Digite seu CPF: ");
        mae.cpf=sc.nextLine();

        System.out.println("Digite a quantidade de filhos: ");
        mae.qtdfilhos=sc.nextInt();

        //Informações do filho
        filho.nome=sc.nextLine();
        System.out.println("Digite o nome do filho: ");
        filho.nome=sc.nextLine();

        System.out.println("Digite o CPF do filho: ");
        filho.cpf=sc.nextLine();

        //Informações da filha
        System.out.println("Digite o nome da filha: ");
        filha.nome=sc.nextLine();

        System.out.println("Digite o CPF da filha: ");
        filha.cpf=sc.nextLine();

        //Imprimir atributos
        System.out.println("Mãe: "+ mae.nome + " " + mae.ano + " " + mae.idade + " " + mae.cpf + " " + mae.qtdfilhos);
        System.out.println("Filho: "+ filho.nome + " " + filho.cpf);
        System.out.println("Filha: "+ filha.nome + " " + filha.cpf);

    }
    
}
