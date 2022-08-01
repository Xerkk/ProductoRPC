
package cliente_servidor_rpc;

import java.util.Vector;
import javax.swing.JOptionPane;
import org.apache.xmlrpc.XmlRpcClient;


public class Cliente {


    public static void main(String[] args) {
        
        Object resultado;
        
        try{
            
            XmlRpcClient cliente = new XmlRpcClient("http://192.168.0.110:8080");
            Vector<String> parametros = new Vector<String>();
            
            JOptionPane.showMessageDialog(null, "El cliente se ha conectado");
            
            while(true){
                
                String menu = JOptionPane.showInputDialog(null, "¿Qué producto desea consultar?\n"
                        + "1.- Chocolate\n"
                        + "2.- Detergente\n"
                        + "3.- Arroz\n"
                        + "4.- Carne\n"
                        + "5.- Pasta\n"
                        + "6.- Salir:\n", "Cliente Servidor RPC", JOptionPane.DEFAULT_OPTION);
                
                switch(menu){
                    
                    case "1":
    
                        parametros.addElement(menu);
                  
                        resultado = cliente.execute("miServidorRPC.producto", parametros);
                        
                        JOptionPane.showMessageDialog(null, "El Chocolate tiene un precio de: " + resultado);
                        
                        parametros.clear();
                        
                    break;
                        
                    case "2":
       
                        parametros.addElement(menu);
                  
                        resultado = cliente.execute("miServidorRPC.producto", parametros);
                        
                        JOptionPane.showMessageDialog(null, "El Detergente tiene un precio de: " + resultado);
                        
                        parametros.clear();
                    
                    break;
                    
                    case "3":

                        parametros.addElement(menu);
                  
                        resultado = cliente.execute("miServidorRPC.producto", parametros);
                        
                        JOptionPane.showMessageDialog(null, "El Arroz tiene un precio de: " + resultado);
                        
                        parametros.clear();
                        
                    break;
                    
                    
                    case "4":
  
                        parametros.addElement(menu);
                  
                        resultado = cliente.execute("miServidorRPC.producto", parametros);
                        
                        JOptionPane.showMessageDialog(null, "El Kilo de Carne tiene un precio de: " + resultado);
                        
                        parametros.clear();
                        
                    break;
                    
                    case "5":

                        parametros.addElement(menu);
                  
                        resultado = cliente.execute("miServidorRPC.producto", parametros);
                        
                        JOptionPane.showMessageDialog(null, "La Pasta tiene un precio de: " + resultado);
                        
                        parametros.clear();
                        
                    break;
                    
                    case "6":
                        
                        JOptionPane.showMessageDialog(null, "Saliendo", null, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                        
                    break;
                }
            }
       
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
    }
    
}
