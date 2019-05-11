package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MiLista {
    
    private List elementos;
    
    public MiLista(){
        this.elementos = new ArrayList();
    }
    
    public void InsertarEnPosicion(){
        
        for (int i=0 ;elementos.size()>i ;i++){
            System.out.println("-> "+i+elementos.get(i));
        }
        System.out.println("seleccione numero para insertar en posicion \n");
        String seleccion=JOptionPane.showInputDialog("Ingrese numero de elemento prara insertar");
        int sele;
        sele=Integer.parseInt(seleccion);
        elementos.add(sele);
        
        for (int i=0 ;elementos.size()>i ;i++){
            System.out.println("-> "+i+" "+elementos.get(i));
        }
        
    }
    public void insertar(Object elem){
        elementos.add(elem);
    }
    
}
