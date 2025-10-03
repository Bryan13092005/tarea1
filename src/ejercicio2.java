import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese su número de cédula: ");
        String id=datos.nextLine();
        while (id.trim().isEmpty()){
            System.out.println("ID no válido. Ingrese nuevamente: ");
            id=datos.nextLine();
        }
        System.out.println("Ingrese su nombre: ");
        String nombre=datos.nextLine();
        while (nombre.trim().isEmpty()){
            System.out.println("Nombre no válido. Ingrese nuevamente: ");
            nombre=datos.nextLine();
        }
        System.out.println("Ingrese su número celular: ");
        String celular=datos.nextLine();
        while (celular.trim().isEmpty()){
            System.out.println("Celular no válido. Ingrese nuevamente: ");
            celular=datos.nextLine();
        }
        System.out.println("Ingrese su email: ");
        String email=datos.nextLine();
        while (email.trim().isEmpty() || !email.contains("@") || !email.contains(".")){
            System.out.println("Email no válido. Ingrese nuevamente: ");
            email=datos.nextLine();
        }
        System.out.println("\nMOSTRANDO DATOS\nNOMBRE: "+nombre+"\nID: "+id+"\nCELULAR: "+celular+"\nCORREO ELECTRÓNICO: "+email);
    }
}//PRUEBA DE COMMITS BRYAN
