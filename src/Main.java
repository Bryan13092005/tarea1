import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos que desea registrar: ");
        int numeroPorductos=datos.nextInt();
        datos.nextLine();
        String[] productos=new String[numeroPorductos];
        int[] stock=new int[numeroPorductos];
        double[] precio=new double[numeroPorductos];
        for (int i = 0; i < numeroPorductos ; i++) {
            System.out.println("Ingrese el nombre del producto "+(i+1)+":");
            productos[i]=datos.nextLine();
            System.out.println("Ingrese el stock del producto "+(i+1)+":");
            stock[i]=datos.nextInt();
            System.out.println("Ingrese el precio unitario del producto "+(i+1)+":");
            precio[i]= datos.nextDouble();
            datos.nextLine();
        }
        for (int i = 0; i < numeroPorductos; i++) {
            double valorTotal=stock[i]*precio[i];
            System.out.println("PRODUCTO: "+productos[i]+"\nSTOCK: "+stock[i]+" unidades\nPRECIO UNITARIO: $"+precio[i]+"\nPRECIO TOTAL DEL STOCK: $"+valorTotal);
            System.out.println("\n------------------------------\n");
        }
    }
}