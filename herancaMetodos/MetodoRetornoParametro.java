
import java.util.Scanner;

public class MetodoRetornoParametro {
    public String carro;
    public int velocidade;

    //Metodo com parametro

    int turboCarro(int turbo){

        Scanner sc = new Scanner(System.in);

        System.out.println
        ("Digite o nome do carro: ");
        this.carro=sc.nextLine();

        System.out.println("Digite a velocidade: ");
        this.velocidade=sc.nextInt();

        int velocidadeTotal = (this.velocidade+turbo);

        System.out.println("A velocidade total é:  " + velocidadeTotal);



        return velocidadeTotal;
    }


}
