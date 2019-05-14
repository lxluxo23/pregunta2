package control;
import modelo.MiLista;
public class ejecutor {
    public static void main(String[] args) {
        
        
        
        MiLista l1 = new MiLista();
        //l1.menu();
        
        
        //********************************
        l1.insertar("luis");
        l1.insertar("cespedes");
        //********************************
        
        
        //********************************
        
                l1.InsertarEnPosicion(1,"universidad");
        
        //*******************************
        
                l1.ConsultarEnPosicion(1);
                
        //*******************************
        
        System.out.println("\n");
        
        //*******************************
        
                l1.EliminarElemento(0);
        
        //*******************************
        
        System.out.println("\n");
        
        //*******************************
        
            l1.modificar(0,"catolica");
        
        //*******************************
        
        
    }
}
