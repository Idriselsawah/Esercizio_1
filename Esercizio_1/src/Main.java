import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    int numero;
	    System.out.println("Inserisci un numero di cui calcolare il quadrato");
	    numero = scan.nextInt();
	    System.out.println(Quadrato(numero));
	    scan.close();
    }
    
    static int Quadrato(int numero)
    {
        return numero * numero;
    }
}
