/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba.aplicacionRMICliente;
import com.company.prueba.view.GUIPrincipal;
import com.mycompany.prueba.model.RMIInterface;

import java.rmi.*;

/**
 *
 * @author team harcore 
 */
public class AplicacionRMICliente
{
    public static void main(String[] args) 
    {
        String host = "192.168.1.7";
        try {
                if(args.length>0){
                    host = args[0];
                }
            RMIInterface model = (RMIInterface) Naming.lookup("//"+host+"/Server");
                if(model == null){
                    System.out.println("Error mi pana ");
                    return;
                }
                GUIPrincipal gui = new GUIPrincipal(model);
                gui.setVisible(true);

        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Aloja");
    }
}
