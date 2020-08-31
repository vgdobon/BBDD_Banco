package com.clases;
import java.util.Scanner;

import com.clases.Cliente;
import com.clases.Cuenta;
import com.sun.security.ntlm.Client;

public class Menu {

    private boolean salir = false;
    Scanner sc = new Scanner(System.in);

    public void MenuPrincipal(){
        while(!salir){
            System.out.println("APLICACIÓN BANCARIA");

            int opcionPrincipal=-1;

            do {
                System.out.println("Elija una opción: \n 1.Crear cliente \n 2.Mostrar Cliente \n 3.Borrar cliente " +
                        "\n 4.Modificar datos \n 5.Transferencia entre cuentas \n 6.Salir");
                opcionPrincipal = sc.nextInt();
                if(opcionPrincipal<1 || opcionPrincipal>6) {
                    System.out.println("No ha elegido la opción correcta");
                }
            }while (opcionPrincipal<1 || opcionPrincipal>6);


            switch (opcionPrincipal){

                case 1://Crear cliente
                    System.out.println("Crear cliente");
                    System.out.println("_____________");

                    System.out.println("Nombre del cliente:");
                    String nombre = sc.nextLine();

                    System.out.println("Apellido del cliente:");
                    String apellido = sc.nextLine();

                    Cliente nuevoCliente = new Cliente(nombre,apellido);

                    int opcionCuenta;
                    int cuentaAsociada;
                    do {
                        System.out.println("Creación de cuenta...");
                        System.out.println("1.Crear nueva cuenta \n " +
                                "2.Asociar a cuenta ya existente");
                        opcionCuenta = sc.nextInt();

                        if(opcionCuenta<1 || opcionCuenta>2) {
                            System.out.println("No has elegido una opción correcta.Escriba 1 ó 2.");
                        }

                        if(opcionCuenta==2){
                            System.out.println("¿ A qué número de cuenta quieres asociarte ?");
                            cuentaAsociada = sc.nextInt();
                        }else{
                            System.out.println("Creacion de nueva cuenta");
                        }
                    }while (opcionCuenta<1 || opcionCuenta>2);







                case 2://Mostrar cliente
                    System.out.println("Mostrar cliente");
                case 3://Borrar cliente
                    System.out.println("Borrar cliente");
                case 4://Modificar datos
                    System.out.println("Modificar datos");
                case 5://Transferencia entre cuentas
                    System.out.println("Transferencia entre cuentas");
                case 6://Salir
                    System.out.println("Salir ");
                    salir=true;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcionPrincipal);
            }

        }
    }

}
