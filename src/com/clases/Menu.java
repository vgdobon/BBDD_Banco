package com.clases;


import java.util.Scanner;

import com.clases.Cliente;
import com.clases.Cuenta;

public class Menu {

    private boolean salir = false;
    Scanner sc = new Scanner(System.in);
    Cliente cl = new Cliente();
    Cuenta cuenta = new Cuenta();

    public void MenuPrincipal(){
        while(!salir){
            System.out.println("APLICACIÓN BANCARIA");
            System.out.println("1.Crear cliente \n 2.Mostrar Cliente \n 3.Borrar cliente " +
                    "\n 4.Modificar datos \n 5.Transferenia entre cuentas \n 6.Salir");
            int opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal){

                case 1:


                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

            }

        }
    }

}
