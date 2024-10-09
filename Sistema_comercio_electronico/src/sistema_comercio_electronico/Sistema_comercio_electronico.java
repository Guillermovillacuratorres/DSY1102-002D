/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_comercio_electronico;

import cl.duoc.models.Electronico;
import cl.duoc.models.Pedido;
import cl.duoc.models.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Sistema_comercio_electronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Electronico> productosElectronicos = new ArrayList<>(); 
        Pedido pedidoUno = new Pedido();
        
        int opcion = 0;
        while(opcion != 5){
            System.out.println("====MENU====");
            System.out.println("[1] - Agregar producto electronico");
            System.out.println("[2] - Visualizar productos");
            System.out.println("[3] - Agregar pedido");
            System.out.println("[4] - Visualizar pedido del cliente");
            System.out.println("[5] - Salir");
            System.out.println("Seleccione una opcion:");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Electronico nuevoElectronico = new Electronico();
                    
                    System.out.println("Ingrese la marca:");
                    nuevoElectronico.setMarca(entrada.next());
                    
                    System.out.println("Ingrese la garantia:");
                    nuevoElectronico.setGarantiaMeses(entrada.nextInt());
                    
                    System.out.println("Ingrese el id del producto:");
                    nuevoElectronico.setId_producto(entrada.next());
                    
                    System.out.println("Ingrese el nombre del producto: ");
                    nuevoElectronico.setNombre(entrada.next());
                    
                    System.out.println("Ingrese el precio del producto: ");
                    nuevoElectronico.setPrecio(entrada.nextDouble());
                    
                    productosElectronicos.add(nuevoElectronico);
                    break;
                case 2:
                    System.out.println("LISTADO DE PRODUCTOS ELECTRONICOS:");
                    if(productosElectronicos.isEmpty()){
                        System.out.println("No hay productos electronicos registrados.");
                    }else{
                        for(Electronico i : productosElectronicos){
                        System.out.println("ID: " + i.getId_producto() + 
                                " -  NOMBRE: " + i.getNombre() + " - PRECIO: " +
                                i.getPrecio());
                    }
                    }
                    break;
                
                case 3:
                    String idProducto = "";
                    System.out.println("Ingrese el id del producto que desea agregar al pedido:");
                    idProducto = entrada.next();
                    for(Electronico i : productosElectronicos){
                        System.out.println("iiiiiiiiiiiii    " + i + " - " + idProducto + " - " + i.getId_producto());
                       if(i.getId_producto().equals(idProducto)) {
                            pedidoUno.agregarProducto(i);
                            pedidoUno.calcularTotal();
                            System.out.println("El total del pedido es: " + pedidoUno.getTotal());
                       }else{
                            System.out.println("Producto no encontrado.");
                       }
                    }

                    break;
                    
                case 4:
                    System.out.println("DATOS PEDIDO" + pedidoUno);
                    for(Producto i : pedidoUno.getProductos()){
                        System.out.println("ID: " + i.getId_producto() + " - Nombre: " + 
                                i.getNombre());
                    }
                    
                default:
                    System.out.println("Opcion no valida.");
                    
            }
        }
    }
    
}
