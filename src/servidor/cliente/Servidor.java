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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Usuario4
 */
public class Servidor {
    
    public static void main (String arg []) throws IOException{
        
        ServerSocket servidor = new
            ServerSocket(8000);
        
        Socket cliente = servidor.accept();
        
        BufferedReader entrada = 
                new BufferedReader (new InputStreamReader(cliente.getInputStream()));
        
        PrintWriter salida =
                new PrintWriter(cliente.getOutputStream(),true);
        
        BufferedReader teclado = 
                 new BufferedReader (new InputStreamReader(System.in));
        
        while(true){
            String mensajeEntrada = entrada.readLine();
            System.out.println("Llega: " + mensajeEntrada);
            
            System.out.println("Mensaje a enviar: ");
            String respuesta = teclado.readLine();
            salida.println(salida);
            
            
    }
        
        
    }
    
}
