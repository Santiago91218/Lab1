import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        /*int num1,num2;
        System.out.print("Ingrese un numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        num2 = sc.nextInt();
        System.out.println("El primer numero es: " + num1);
        System.out.println("El segundo numero es: " + num2);*/

        //Ejercicio 2
        /*String nombre;
        System.out.print("Ingrse su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Su nombre es: "+ nombre);*/

        //Ejercicio 3
        /*int num,doble,triple;
        System.out.print("Ingrese un numero: ");
        num= sc.nextInt();
        doble=num*2;
        System.out.println("El doble del numero es: "+ doble);
        triple=num*3;
        System.out.println("El triple del numero es: "+ triple);*/

        //Ejercicio 4
        /*double grados_centigrados,Fahrenheit;
        System.out.print("Ingrese los grados centigrados: ");
        grados_centigrados = sc.nextDouble();
        Fahrenheit=32+(9*grados_centigrados/5);
        System.out.println("Grados Fahrenheit: "+ Fahrenheit);*/

        //Ejercicio 5
        /*double radio,area,longitud;
        System.out.print("Ingrese el radio de la cincurferencia: ");
        radio= sc.nextDouble();
        area=Math.PI * Math.pow(radio, 2);
        longitud=2 * Math.PI * radio;
        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Longitud de la circunferencia: " + longitud);*/

        //Ejercicio 6
        /*double km,ms;
        System.out.print("Ingrese la velocidad en km: ");
        km= sc.nextDouble();
        ms= km/3.6;
        System.out.println("la velocidad en km a ms " + ms);*/

        //Ejercicio 7
        /*double catetoA,catetoB,hipotenusa;
        System.out.print("Ingrese la longitud del catetoA: ");
        catetoA= sc.nextDouble();
        System.out.print("Ingrese la longitud del catetoB: ");
        catetoB= sc.nextDouble();
        hipotenusa=Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.println("La longitud de la hipotenusa es:  " +hipotenusa);*/

        //Ejercicio 8
        /*double radio,volumen;
        System.out.print("Ingrese la longitud del radio de una esfera: ");
        radio= sc.nextDouble();
        volumen=(4.0/3)*Math.PI*Math.pow(radio,3);
        System.out.println("El volumen de la esfera es: "+volumen);*/

        //Ejercicio 9
        /*double a,b,c,p,area;
        System.out.print("Ingrese la longitud del lado a: ");
        a= sc.nextDouble();
        System.out.print("Ingrese la longitud del lado b: ");
        b= sc.nextDouble();
        System.out.print("Ingrese la longitud del lado c: ");
        c= sc.nextDouble();
        p=(a+b+c)/2;
        area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("El area del triangulo es: "+area);*/

        //Ejercicio 10
        /*int num;
        System.out.print("Ingrese un numero de 3 cifras: ");
        num= sc.nextInt();
        System.out.println("Las cifras del numero son: "+num/100+", "+(num/10)%10+", "+num%10 );*/

        //Ejercicio 11
        /*int num;
        String conversion,cifrasConcatenadas;
        cifrasConcatenadas="";
        System.out.print("Ingrese un numero de 5 cifras: ");
        num= sc.nextInt();
        conversion=Integer.toString(num);

        for(int i=0;i < conversion.length();i++){
            cifrasConcatenadas += conversion.charAt(i);
            System.out.println(cifrasConcatenadas);
        }*/

        //Ejercicio 12
        /*int num;
        System.out.print("Ingrese un numero de 5 cifras: ");
        num= sc.nextInt();
        System.out.println(num%10);
        System.out.println(num%100);
        System.out.println(num%1000);
        System.out.println(num%10000);
        System.out.println(num);*/


        //Ejercicio 13
        /*int dia,mes,anio,sum,num_suerte;
        System.out.print("Ingrese el dia en que nacio: ");
        dia= sc.nextInt();
        System.out.print("Ingrese el mes en que nacio: ");
        mes= sc.nextInt();
        System.out.print("Ingrese el año en que nacio: ");
        anio= sc.nextInt();
        sum=dia+mes+anio;
        System.out.println(sum);
        num_suerte=(sum/1000)+(sum/100)%10+(sum/10)%10+sum%10;
        System.out.println("Su numero de la suerte es: " +num_suerte);*/


        //Ejercicio 14
        /*double precioSinIva,total_vendidos,iva_porcentaje,precio_venta,total;
        System.out.print("Ingrese el precio por unidad (sin IVA): ");
        precioSinIva= sc.nextDouble();
        System.out.print("Ingrese el numero de productos vendidos: ");
        total_vendidos= sc.nextDouble();
        System.out.print("Ingrese el IVA aplicado: ");
        iva_porcentaje= sc.nextDouble();

        double totalSinIva=precioSinIva*total_vendidos;
        double iva= (totalSinIva*iva_porcentaje)/100;
        total=totalSinIva+iva;

        System.out.println("Precio total sin IVA: " + totalSinIva);
        System.out.println("Monto del IVA: " + iva);
        System.out.print("El precio de venta del producto es: "+ total);*/

        //Ejercicio 15
            /*int N,m,nuevoValorN;
        System.out.print("Ingrese un numero (N): ");
        N= sc.nextInt();
        System.out.print("Ingrese un numero (m): ");
        m= sc.nextInt();

        nuevoValorN=N / (int) Math.pow(10, m);
        System.out.println("El nuevo valor de N es: " + nuevoValorN);*/

        //Ejercicio 16
        /*double gradosCentigrados,gradosReamur,gradosKelvin;
        System.out.print("Ingrese los grados Centigrados: ");
        gradosCentigrados= sc.nextDouble();
        gradosReamur= gradosCentigrados  * 0.80;
        gradosKelvin = gradosCentigrados + 273.15;
        System.out.println("Valor en GradosReamur: "+ gradosReamur);
        System.out.println("Valor en GradosKelvin: "+ gradosKelvin);*/


        }
    }