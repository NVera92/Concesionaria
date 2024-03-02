package com.todocode.concesionaria.logica;

import com.todocode.concesionaria.persistencia.AutomovilJpaController;
import com.todocode.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();

  

    public void agregarAutomovil(int id, String marca, String modelo, String motor, String color, String patente, int cantPuertas) {
        Automovil aux = new Automovil(id, marca, modelo, motor, color, patente, cantPuertas);
        control.agregarAutomovil(aux);
    }

    public List<Automovil> traerAutos() {
        List<Automovil> lista = control.traerAutos();
        return lista;
    }

    public void borrarAuto(int idAuto) {
        control.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        Automovil auto = new Automovil();
        auto = control.traerAutos(idAuto);
        return auto;
    }

    public void modificarAutomovil(Automovil auto, String marca, String modelo, String motor,String color, String patente, int cantPuertas) {
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantPuertas);
        
        control.modificarAutomovil(auto);
        
    }

    
    
    
    
    
    
}
