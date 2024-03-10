//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

/*
una pequeña despensa desea calcular los sueldos de sus empleados.
los puestos de los mismo pueden tener 3 categorias:
1- repositor, 2-cajero y 3- supervisor.

*los repositores cobran $15.890 + un bonmo del 10%
*los cajeros cobran $25.630,89 fijos
*Los supervisores cobran $35,560,20 en bruto al cual se les descuenta un 11% de jubilación.

se necesita un programa que , dependiendo del tipo de empleado del que se trate, calcule
y muestre en pantalla el correspondiente sueldo
 */
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Porfavor Elija su Categoría");
        System.out.println("Repositor: 1");
        System.out.println("Cajero: 2");
        System.out.println("Supervisor: 3");
        System.out.println("Elija su categoría correspondiente por favor: ");
        Scanner empleado = new Scanner(System.in);
        int sueldo = empleado.nextInt();
        switch (sueldo) {
            case 1:
                repositor();
                break;
            case 2:
                cajero();
                break;
            case 3:
                supervisor();
                break;
            default:
                System.out.println("No existe esa categoría");
        }

    }

    static void repositor() {
        System.out.println("tu sueldo es : $" + (15.890 +(15.890*0.10)));
    }

    static void cajero() {
        System.out.println("tu sueldo es : $$25.630,89");
    }

    static void supervisor() {
        System.out.println("tu sueldo es : $" + (35560.20 - (35560.20*0.11) ));
    }
}
