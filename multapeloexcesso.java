import java.util.Scanner;

public class multapeloexcesso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso, excesso, multa;

        System.out.print("Digite o peso de peixes(Em kg): ");
        peso = teclado.nextDouble();

        excesso = peso - 50;
        multa = (excesso * 4);

        if (excesso > 0) {
            System.out.print("Por conta do peso de peixes ser " + peso + "kg, excedeu " + excesso + "kg além do limite de 50kg \nA multa aplicada foi de R$" + multa);
        } else {
            System.out.print("Não há multa a pagar!");
            }
        
        teclado.close();
    }
}