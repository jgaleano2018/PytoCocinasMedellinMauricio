/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.cocinasmedellin;

/**
 *
 * @author Jose Mauricio
 */
public class MainCocinasMedellin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creo el jefe de cocina:        
        Chef jefeCocina = new Chef();        
        jefeCocina = createChef(15860960, "Juan Pedro Perez", "Calle 60 #65-15", "2505585", "Chef", jefeCocina);

        System.out.println(jefeCocina.toString());
        
        //Creo la Cocina:
        Cocina cocina = new Cocina();        
        cocina = createCocina("Cocina Flavor Paisa", "Tradicional", "Calle 57 #50-12", "5807040", jefeCocina, cocina);

        System.out.println(cocina.toString());
        
        EstructuraIngrediente contestura = new EstructuraIngrediente();
        contestura.consecutivo=1;
        contestura.nombreEstructura="Solido";

        EstructuraIngrediente contestura2 = new EstructuraIngrediente();
        contestura2.consecutivo=2;
        contestura2.nombreEstructura="Liquido";

        //Creo el inventario
        Ingrediente[] listaInventario = new Ingrediente[1];
        Ingrediente newIngrediente = new Ingrediente();
        
        newIngrediente.nombre = "Papa";
        newIngrediente.cantidad = 10;
        newIngrediente.contestura = contestura;
        newIngrediente.contable=true;
        
        listaInventario=addInventario(newIngrediente, listaInventario);

        newIngrediente.nombre = "Arroz";
        newIngrediente.cantidad = 1;
        newIngrediente.contestura = contestura2;
        newIngrediente.contable=false;
        
        listaInventario=addInventario(newIngrediente, listaInventario);

        newIngrediente.nombre = "Coco";
        newIngrediente.cantidad = 1;
        newIngrediente.contestura = contestura2;
        newIngrediente.contable=true;
        
        listaInventario=addInventario(newIngrediente, listaInventario);


        //Creo el inventario de las recetas
        Ingrediente[] listaInventarioReceta = new Ingrediente[1];
        Ingrediente newIngredienteReceta = new Ingrediente();
        
        newIngredienteReceta.nombre = "Papa";
        newIngredienteReceta.cantidad = 5;
        newIngredienteReceta.contestura = contestura;
        newIngredienteReceta.contable=true;
        
        listaInventarioReceta=addInventario(newIngredienteReceta, listaInventarioReceta);

        newIngredienteReceta.nombre = "Arroz";
        newIngredienteReceta.cantidad = 1;
        newIngredienteReceta.contestura = contestura2;
        newIngredienteReceta.contable=false;
        
        listaInventarioReceta=addInventario(newIngredienteReceta, listaInventarioReceta);

        newIngredienteReceta.nombre = "Coco";
        newIngredienteReceta.cantidad = 1;
        newIngredienteReceta.contestura = contestura2;
        newIngredienteReceta.contable=true;
        
        listaInventarioReceta=addInventario(newIngredienteReceta, listaInventarioReceta);

        
        /*Se crean las recetas*/
        Receta receta = new Receta();
        receta = createReceta(listaInventario[0], "Receta1", "Receta1", receta); 
        receta = createReceta(listaInventario[1], "Receta1", "Receta1", receta);

        System.out.println(receta.toString());
        
        /*Se crean los platos*/ 
        Plato plato = new Plato();        
        plato = createPlato("Arroz de Coco", receta, 15000.00, plato);
        
        System.out.println(plato.toString());

        /*Se toma el pedido del cliente*/ 
        Pedido pedido = new Pedido();
        pedido = getPedidoCliente(1,1,"02/07/2018",1,1,1,pedido);
        
        System.out.println(pedido.toString());

        //Se valida las recetas del pedido contra el inventario
        Receta receta2 = new Receta(); 
        Ingrediente[] inventarioEvaluado = new Ingrediente[1]; 
        inventarioEvaluado = receta2.validarInventarioReceta(listaInventario, plato);
               
        if (inventarioEvaluado.length>0)
        {
            try {
                for (int i=0; i<inventarioEvaluado.length; i++){
                    System.out.println("El siguiente ingrediente esta agotado: \n Código: "+inventarioEvaluado[i].getConsecutivo() + " \n Nombre: "+inventarioEvaluado[i].getNombre()+".");
                }            
                System.out.println("El pedido: "+pedido.getConsecutivoPedido()+" no puede ser entregado.");
            }
            catch (Exception e) {
                
                System.out.println("El pedido: "+pedido.getConsecutivoPedido()+" puede ser entregado.");
            }
        }
        else 
        {
            if (receta2.getError() != null)
            {
                System.out.println(receta2.getError());
                System.out.println("El pedido: "+pedido.getConsecutivoPedido()+" no puede ser entregado.");
            }
            else 
            {
                System.out.println("El pedido: "+pedido.getConsecutivoPedido()+" puede ser entregado.");
            }
        }
        
    }

    public static Chef createChef(int identificador, String nombre, String direccion, String telefono, String ocupacion, Chef modelJefeCocina){
        
        if (modelJefeCocina.getNombre() != nombre){
            modelJefeCocina.setIdentificador(identificador);
            modelJefeCocina.setNombre(nombre);
            modelJefeCocina.setDireccion(direccion);
            modelJefeCocina.setTelefono(telefono);
            modelJefeCocina.setOcupacion(ocupacion);
        }
        
        return (modelJefeCocina);
     }

     public static Cocina createCocina(String nombre, String especialidad, String direccion, String telefono, Chef jefeCocina, Cocina modelCocina){
        
        if (modelCocina.getNombre() != nombre){
            modelCocina.setConsecutivo(modelCocina.getConsecutivo() + 1);
            modelCocina.setNombre(nombre);
            modelCocina.setEspecialidad(especialidad);
            modelCocina.setJefeCocina(jefeCocina);
            modelCocina.setDireccion(direccion);
            modelCocina.setTelefono(telefono);
        }
        
        return (modelCocina);
     }
    
    public static Ingrediente[] addInventario(Ingrediente ingrediente, Ingrediente[] inventario){
        
        int tamaño = (inventario.length + 1);       
        Ingrediente[] inventarioAux = new Ingrediente[tamaño];
        
        for (int i = 0; i<inventario.length; i++){ 
            inventarioAux[i] = inventario[i];            
        }
        
        inventarioAux[tamaño-1] = ingrediente; 
        
        return (inventarioAux);
    }

     public static Receta createReceta(Ingrediente ingrediente, String nombre, String descripcion, Receta modelReceta){
        
        if (modelReceta.getNombreReceta() != nombre){
            modelReceta.setNombreReceta(nombre);
            modelReceta.setDescripción(descripcion);
            modelReceta.setConsecutivoReceta(modelReceta.getConsecutivoReceta() + 1);

            int tamaño = (modelReceta.getInventario().length + 1);       
            Ingrediente[] inventarioAux = new Ingrediente[tamaño];

            for (int i = 0; i<modelReceta.getInventario().length; i++){ 
                inventarioAux[i] = modelReceta.getInventario()[i];            
            } 
            inventarioAux[tamaño-1] = ingrediente; 

            modelReceta.setInventario(inventarioAux);
        }
        else {
            int tamaño = (modelReceta.getInventario().length + 1);       
            Ingrediente[] inventarioAux = new Ingrediente[tamaño];

            for (int i = 0; i<modelReceta.getInventario().length; i++){ 
                inventarioAux[i] = modelReceta.getInventario()[i];            
            } 
            inventarioAux[tamaño-1] = ingrediente; 

            modelReceta.setInventario(inventarioAux);
        }
        return (modelReceta);
    }
     
     public static Plato createPlato(String nombre, Receta modelReceta, Double precio, Plato modelPlato){
        
        if (modelPlato.getNombre() != nombre){
            modelPlato.setConsecutivo(modelPlato.getConsecutivo() + 1);
            modelPlato.setNombre(nombre);
            modelPlato.setPrecio(precio);
            modelPlato.setReceta(modelReceta);            
        }
        
        return (modelPlato);
     }
     
     public static Pedido getPedidoCliente(int consecutivoPlato,int consecutivoCliente,String fecha,int porcentajePago,int cantidad,double porcion, Pedido modelPedido){

         modelPedido.setConsecutivoPedido(modelPedido.getConsecutivoPedido() + 1);
         modelPedido.setConsecutivoPlato(consecutivoPlato);
         modelPedido.setConsecutivoCliente(consecutivoCliente);
         modelPedido.setFecha(fecha);
         modelPedido.setPorcentajePago(porcentajePago);
         modelPedido.setPorcion(porcion);
         modelPedido.setCantidad(cantidad);
         
         return (modelPedido);
     }
}
