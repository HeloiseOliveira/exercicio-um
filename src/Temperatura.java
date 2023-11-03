/** Escreva um programa que, com base em uma temperatura em graus celsius, a converta
e exiba em Kelvin(k), Réamur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as formulas F=C*1.8+32;
 K=C+273.15; Re=C*0.08; Ra=C*1.8+32+459.67**/


public class Temperatura {
    public static void main(String[] args) {
        double C,K,F,Re,Ra;
        C = 2.43;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("A temperatura em Fahreheint é :" + F);
        System.out.println("A temperatura em Kelvin é :" + K);
        System.out.println("A temperatura em Reamur é :" + Ra);
        System.out.println("A temperatura em Rankine é : " + Re);
    }
}