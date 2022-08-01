
package servidor_cliente_rpc;

import javax.swing.JOptionPane;
import org.apache.xmlrpc.WebServer;

public class Servidor {


    public static void main(String[] args) {
        
        try{
            
            JOptionPane.showMessageDialog(null, "Iniciando el Servidor");
            
            WebServer server = new WebServer(8080);
            
            Producto producto = new Producto();
            
            server.addHandler("miServidorRPC", producto);
            
            server.start();
            
            JOptionPane.showMessageDialog(null, "Servidor en linea");
            
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            
        }
        
    }
    
}
