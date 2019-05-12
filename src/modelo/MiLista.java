package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiLista {

    Scanner scaner = new Scanner(System.in);
    Scanner scaner2 = new Scanner(System.in);
    Scanner opcion = new Scanner(System.in);
    boolean vivo = true;
    private List elementos;

    public MiLista() {
        this.elementos = new ArrayList();
    }

    public void menu() {

        System.out.println("\n");
        System.out.println("1) Consultar el elemento en una posicion");
        System.out.println("2) Insertar elemento en una posicion");
        System.out.println("3) eliminar el elemento en una posicion");
        System.out.println("4) Modificar el elemento en una posicion");
        System.out.println("5) Salir");

        System.out.println("\n Selecciona una opcion: ");
        int op = opcion.nextInt();

        if (op == 1) {

            ConsultarEnPosicion();

        }
        if (op == 2) {
            InsertarEnPosicion();
        }
        if (op == 3) {
            EliminarElemento();
        }
        if (op==4 ){
            modificar();
        }

    }

    public void mostrar() {

        for (int i = 0; elementos.size() > i; i++) {
            System.out.println("-> " + i + " " + elementos.get(i));
        }

    }

    public void InsertarEnPosicion() {

        if (isEmpy() != true) {
            this.mostrar();

            System.out.println("\n seleccione numero para insertar en posicion: ");
            int indice = scaner.nextInt();
            if (indice > elementos.size()) {
                System.out.println("se escapa de los limites de la lista ");
                InsertarEnPosicion();
            } else {

                System.out.println("inserte texto a ingresar: \n");

                String texto = scaner2.nextLine();
                elementos.add(indice, texto);
                this.mostrar();

            }

        }

    }

    public void ConsultarEnPosicion() {
        System.out.println("ingrese la posicion que quiere mostrar");

        int opc = scaner.nextInt() - 1;

        System.out.println("el elemto en esa posicion, tiene los datos: " + elementos.get(opc));

    }

    public void EliminarElemento() {

        if (isEmpy() != true) {
            mostrar();

            System.out.println("\n seleccione numero para eliminar en posicion: ");
            int indice = scaner.nextInt();
            if (indice > elementos.size()) {
                System.out.println("se escapa de los limites de la lista ");
                EliminarElemento();
            } else {

                elementos.remove(indice);
                this.mostrar();
            }

        } else {
            System.out.println("La lista esta vacia");
        }

    }

    public void modificar() {
        if (isEmpy() != true) {
            mostrar();
            System.out.println("\n seleccione numero para eliminar en posicion: ");
            int indice = scaner.nextInt();

            if (indice > elementos.size()) {
                System.out.println("se escapa de los limites de la lista ");
                modificar();
            } else {
                System.out.println("inserte texto a ingresar: \n");

                String texto = scaner2.nextLine();
                elementos.set(indice, texto);
                mostrar();
            }
        } else {
            System.out.println("la lista esta vacia");
        }
    }

    public void insertar(Object elem) {
        elementos.add(elem);
    }

    public boolean isEmpy() {

        return elementos.isEmpty();
    }

}
