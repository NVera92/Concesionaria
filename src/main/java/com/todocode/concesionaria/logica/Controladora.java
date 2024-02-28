package com.todocode.concesionaria.logica;

import com.todocode.concesionaria.persistencia.AutomovilJpaController;
import com.todocode.concesionaria.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();

  

    public void agregarAutomovil(int id,String marca, String modelo, String motor, String patente, int cantPuertas) {
        Automovil aux = new Automovil(id, marca, modelo, motor, motor, patente, cantPuertas);
        control.agregarAutomovil(aux);
    }
    
    
    
    
    
}
