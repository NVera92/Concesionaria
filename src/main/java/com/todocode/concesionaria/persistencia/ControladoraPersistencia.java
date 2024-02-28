
package com.todocode.concesionaria.persistencia;

import com.todocode.concesionaria.logica.Automovil;


public class ControladoraPersistencia {

    AutomovilJpaController automovilJpaController = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil aux) {
        automovilJpaController.create(aux);
    }
    
}
