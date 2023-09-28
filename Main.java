import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Decalaracion de variables
        int num1,num2,opcion;
        boolean condicion;
        num1=num2=opcion=0;
        condicion=true;

        while(opcion!=5){
            //Le pedimos al usuario el eliga una opcion
            System.out.println("Eliga una opcion (ingrese el numero de la opcion): 1)Suma 2)Resta 3)Multiplicacion 4)Division 5)Salir");
            opcion= sc.nextInt();

            //Validamos la opcion elegida
            if(opcion>=1 && opcion<=4){
                System.out.println("Ingrese un numero: ");
                num1= sc.nextInt();
                System.out.println("Ingrese otro numero: ");
                num2= sc.nextInt();
            }

            if(opcion==1){
                System.out.println("Has elegido Suma");
                //Sumamos los numeros ingresados y mostramos por pantalla el resultado
                int suma=num1+num2;
                System.out.println("El resultado de la operacion es: "+suma);
            }else if(opcion==2){
                System.out.println("Has elegido Resta");
                //Restamos los numeros ingresados y mostramos por pantalla el resultado
                int resta=num1-num2;
                System.out.println("El resultado de la operacion es: "+resta);
            }else if(opcion==3){
                System.out.println("Has elegido Multiplicacion");
                //Multiplicamos los numeros ingresados y mostramos por pantalla el resultado
                int multp=num1*num2;
                System.out.println("El resultado de la operacion es: "+multp);
            }else if(opcion==4){
                System.out.println("Has elegido Division");
                if(num2==0){
                    //Validamos la division por 0
                    System.out.println("No se puede dividir por 0");
                }else{
                    //Dividimos los numeros ingresados y mostramos por pantalla el resultado
                    double div=num1/num2;
                    System.out.println("El resultado de la operacion es: "+div);
                }
            }else if(opcion==5){
                //Mostamos por pantalla un mensaje indicando el fin de la ejecucion del pograma
                System.out.println("Saliendo...");
            }else{
                //Validamos que la opcion ingresada
                System.out.println("La opcion ingresada no es valida");
                }
            }
        }
    }
