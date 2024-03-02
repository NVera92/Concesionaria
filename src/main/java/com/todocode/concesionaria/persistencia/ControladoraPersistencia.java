
package com.todocode.concesionaria.persistencia;

import com.todocode.concesionaria.logica.Automovil;
import com.todocode.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    AutomovilJpaController automovilJpaController = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil aux) {
        automovilJpaController.create(aux);
    }

    public List<Automovil> traerAutos() {
        List<Automovil> lista = automovilJpaController.findAutomovilEntities();
        return lista;
    }

    public void borrarAuto(int idAuto) {
        try {
            automovilJpaController.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutos(int idAuto) {
        Automovil auto = new Automovil();
        auto = automovilJpaController.findAutomovil(idAuto);
        return auto;
    }

    public void modificarAutomovil(Automovil auto) {
        try {
            automovilJpaController.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
