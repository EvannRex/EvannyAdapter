
package com.axity.example;
import adaptador.*;
import java.util.Scanner;
public class Main {

    private static Scanner entrada = new Scanner(System.in);
    private static Motor motor;
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("\n1. encender motor a gasolina");
            System.out.println("2. encender motor a diesel");
            System.out.println("3. encender motor electrico");
            System.out.println("4. salir");
            System.out.println("seleccione una opcion: ");
            opcion= entrada.nextInt();
            switch(opcion){
                case 1:
                    motor= new MotorGasolina();
                    usarMotor();
                    break;
                case 2:
                    motor= new MotorDiesel();
                    usarMotor();
                    break;
                case 3:
                    motor= new MotorElectricoAdapter();
                    usarMotor();
                    break;
                case 4:
                    System.out.println("cerrando programa");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }

        }while(opcion!=4);
    }

        public static void usarMotor(){
            motor.encender();
            motor.acelerar();
            motor.apagar();
        }

    }

