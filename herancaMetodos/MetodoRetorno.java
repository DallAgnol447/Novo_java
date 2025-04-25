
import java.util.Scanner;

public class MetodoRetorno {
    
    public String nome;
    public Float n1;
    public Float n2;

    //Metodo com retorno

    Float calculaNotas(){

        Scanner sc = new Scanner(System.in);

        System.out.println
        ("Informe a nota 1: ");
        this.n1=sc.nextFloat();

        System.out.println("Digite a nota 2: ");
        this.n2=sc.nextFloat();

        Float media = (this.n1+this.n2)/2;
        System.out.println(media);


        return media;

    }

}
