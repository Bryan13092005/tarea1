import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad=datos.nextInt();
        //datos.nextLine();
        System.out.println("Ingrese su altura: ");
        double altura=datos.nextDouble();
        datos.nextLine();
        if (edad<0 || altura <0) {
            System.out.println("La edad y altura deben ser positivos");
        }else if (edad >=18 && altura>=1.60) {
            System.out.println("Si cumple con los requisitos");
        }else{
            System.out.println("No cumple los requisitos");
        }
    }
}
