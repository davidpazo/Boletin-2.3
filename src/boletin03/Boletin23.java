// cambio de € a $

package boletin03;

import java.util.Scanner;

/**
 *
 * @author dpazolopez
 */
public class Boletin23 {

    public static void main(String[] args) {

        float euros,dolares;
        System.out.print("euros = ");
        Scanner dato= new Scanner (System.in);
        euros=dato.nextFloat();
        System.out.print("1 dolares = "+ "euros");
        Scanner dato2= new Scanner (System.in);
        dolares=dato2.nextFloat();
        System.out.print(" cambio = "+ dolares*euros +"dolares");
} 
}
