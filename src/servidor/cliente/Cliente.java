/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Usuario4
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Socket cliente = 
                new Socket ("168.176.36.110",9000);
        
        BufferedReader entrada = 
                new BufferedReader (new InputStreamReader(cliente.getInputStream()));
        
        PrintWriter salida =
                new PrintWriter(cliente.getOutputStream(),true);
        
        BufferedReader teclado = 
                 new BufferedReader (new InputStreamReader(System.in));
        
        while(true){
            System.out.println("Mensaje a enviar: ");
            String mensaje = teclado.readLine();
            salida.println(mensaje);
            
            String llego = entrada.readLine();
            System.out.println("Llega: " +llego);
        }
    }
    
}
