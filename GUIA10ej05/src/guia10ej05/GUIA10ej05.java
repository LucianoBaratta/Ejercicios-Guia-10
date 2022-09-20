/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package guia10ej05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GUIA10ej05 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num = (int) (Math.random()*100+1);
        System.out.println(num);
        boolean fin=true;
                
        int cont=1;
        int num2=0;
        
        do {
            try{
                System.out.println("Intento numero : " +cont);
                System.out.println("Ingrese un numero");
                num2 = leer.nextInt();
                if (num2 == num) {
                    fin=false;
                } else if (num < num2){
                    System.out.println("El numero " +num2+ " es mayor");   
                } else if (num > num2){
                    System.out.println("El numero " +num2+ " es menor");
                }
                cont++;
            }catch (InputMismatchException e ){
                System.out.println("Perdiste!" +e.toString()); 
                cont++;
                leer.next();
            }   
        } while ( fin && cont < 6); 

    }
    
}
