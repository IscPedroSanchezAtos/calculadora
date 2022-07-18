import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args){


    int op;
    int first;
    int second;
    int resultado;
    double res;
    double num;
        do {
            Scanner scr = new Scanner(System.in);
            System.out.println("Elige una opción:" + "\n" +
                    "1.- Hacer una Suma;" + "\n" +
                    "2.- Hacer una Resta;" + "\n" +
                    "3.- Hacer una Multiplicación;" + "\n" +
                    "4.- Hacer una División;" + "\n"+
                    "5.- Calcular Seno;" + "\n"+
                    "6.- Calcular Coseno;" + "\n"+
                    "7.- SALIR" + "\n"
            );
             op = scr.nextInt();

            switch (op) {
                case 1 :
                    System.out.println("Ingrese el primer valor a Sumar:");
                    first = scr.nextInt();
                    System.out.println("ingrese el segundo valor a Sumar:");
                    second = scr.nextInt();



                    resultado = Suma.suma(first, second);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El resultado de la Suma es: " + resultado+"\n");

                break;
                case 2 :
                    System.out.println("Ingrese el primer valor a Restar:");
                    first = scr.nextInt();
                    System.out.println("ingrese el segundo valor a Restar:");
                    second = scr.nextInt();




                    resultado = Resta.resta(first, second);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El resultado de la Resta es: " + resultado+"\n");
                break;
                case 3 :
                    System.out.println("Ingrese el primer valor a Multiplicar:");
                    first = scr.nextInt();
                    System.out.println("ingrese el segundo valor a Multiplicar:");
                    second = scr.nextInt();



                    resultado = Multiplicacion.multiplicacion(first, second);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El resultado de la Multiplicación es: " + resultado+"\n");
                break;
                case 4 :
                    System.out.println("Ingrese el primer valor a Dividir:");
                    first = scr.nextInt();
                    System.out.println("ingrese el segundo valor a Dividir:");
                    second = scr.nextInt();



                    resultado = Division.division(first, second);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El resultado de la División es: " + resultado+"\n");
                break;
                case 5 :
                    System.out.println("Ingrese el valor para calcular el Seno:");
                    num = scr.nextInt();

                    res =Seno.seno(num);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El resultado del seno de " +num+"° es: " + res+"\n");

                    break;
                case 6 :
                    System.out.println("Ingrese el valor para calcular el Coseno:");
                    num = scr.nextInt();

                    res =Coseno.coseno(num);
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("El resultado del coseno de " +num+"° es: " + res+"\n");

                    break;
                case 7:
                    System.out.println("Hasta Pronto");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while (op != 7);

        //System.out.println(second);


    }
}
