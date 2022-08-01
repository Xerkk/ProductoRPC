
package servidor_cliente_rpc;


public class Producto {
    
 /*   public String suma(String a, String b){
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }*/
    
    String precio;
    
    public String producto(String producto){
        
        switch(producto){
        
            case "1":
              
                precio = "2$";
            
            break;
            
            case "2":
              
                precio = "3$";
            
            break;
            
            case "3":
              
                precio = "2$";
            
            break;
            
            case "4":
              
                precio = "5$";
            
            break;
            
            case "5":
              
                precio = "2$";
            
            break;
        }
        
        return precio;
    }
}
