/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actividad;
import java.util.*; 
/**
 *
 * @author Alejandra Montaño, Alejandro Christlieb, Carlos Huerta 
 * 
 */
public class Actividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String banco, numcuenta, compatel, telefono; 
        int cuenta, recarga, numtel, pin, pinest; 
        char proceso; 
        double saldo, dinero, trans;
        boolean acceso, otro, procesoc, procesoa, procesob, procesoab, procesobb, procesocb; 
        otro=true; 
        saldo=7856; 
        pinest=1313;
  
        Scanner keyboard = new Scanner (System.in);
            procesoa=false;
            while (procesoa==false) {
            System.out.println("Ingrese su pin"); 
            pin = keyboard.nextInt(); 
            if (pin==pinest) 
                procesoa = true; 
            else 
            { System.out.println("Pin inválido, el pin debe ser de cuatro números, inténtelo de nuevo"); 
                procesoa=false; 
            }} 
            while (otro) {
                procesoc=false; 
                procesobb=false;
                procesob=false; 
                procesoab=false;
                procesocb=false; 
                System.out.println("Bienvenido, ¿qué proceso quiere realizar? \n a.Sacar dinero \n b.Transacción \n c.Pago telefónico");
                proceso = keyboard.next().charAt(0);
                switch (proceso) {
                    case 'a':
                        while (procesoab==false)
                                {
                                    System.out.println("Su saldo es de " + saldo + " pesos. ¿Cuánto dinero quiere sacar?"); 
                                      dinero = keyboard.nextDouble(); 
                                      if (dinero>0 && dinero<=saldo)
                                      {
                                    saldo = saldo - dinero; 
                                    System.out.println("Recoga su dinero, sacó " + dinero + ", su saldo restante es de " + saldo + " pesos"); 
                                    procesoab=true; 
                                } 
                                      else 
                                      System.out.println("No puede sacar esa cantidad de dinero, vuelva a intentarlo"); 
                            }

                        break; 
                    case 'b':
                        System.out.println("¿A qué banco quiere transferir dinero? \n a.Santander \n b.Bancomer \n c.HSBC \n d.Banamex \n e.Banorte \n Escriba el banco de su elección");
                        banco = keyboard.next(); 
                        while (procesob==false)
                        {
                        System.out.println("Ingrese su número de cuenta");
                        numcuenta = keyboard.next(); 
                        cuenta = numcuenta.length(); 
                        if (cuenta==10)
                        {   while (procesobb==false)
                        {

                            System.out.println("¿Cuánto dinero quiere transferir?");

                            trans = keyboard.nextDouble(); 
                            procesob=true; 
                                if (trans>0 && trans<=saldo) {
                                    saldo = saldo - trans;
                                    System.out.println("Transfirió " + trans + " pesos a " + banco + ". Su saldo restante es de " + saldo + " pesos.");
                                    procesobb=true; }
                                else
                                    System.out.println("No puede transferir esa cantidad, inténtelo de nuevo"); }
                        }
                        else 
                            System.out.println("Número de cuenta inválido, debe ser de 10 dígitos, vuelva a intentarlo"); }
                        break; 
                    case 'c': 
                        System.out.println("¿A qué compañía quiere recargar? Escriba el nombre \n a. Telcel \n b. AT&T \n c. Movistar");
                        compatel = keyboard.next(); 
                        while (procesoc==false) {
                        System.out.println("Ingrese su número telefónico");
                        telefono = keyboard.next();
                        numtel = telefono.length();
                        if (numtel==10)
                        {
                            procesoc=true;
                            while (procesocb==false) {
                            System.out.println("¿Cuánto dinero quiere recargar? Escriba la cantidad \n a.$30 \n b.$50 \n c.$100 \n d.$200");
                            recarga = keyboard.nextInt(); 
                            if (recarga==30 || recarga==50 || recarga==100 || recarga==200 && recarga<=saldo)
                            { saldo = saldo - recarga; 
                              System.out.println("Transfirió " + recarga + " pesos a " + compatel + ", su saldo restante es de " + saldo);
                              procesocb=true; 
                            } 
                            else 
                                System.out.println("No puede transferir esa cantidad, vuelva a intentarlo");
                        }} 
                        else 
                            System.out.println("Número telefónico inválido, debe de ser de 10 dígitos, vuelva a intentarlo"); }
                        break; 
                        default: 
                        break; 
            }
                
                 System.out.println("¿Desea realizar otra acción? Conteste true o false"); 
                otro = keyboard.nextBoolean(); 
        
            }    }
    }              
      
    

