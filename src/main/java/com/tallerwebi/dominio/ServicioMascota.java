package com.tallerwebi.dominio;

import java.util.List;

public interface ServicioMascota {

    void registrarMascota(Mascota mascota);

    List<Mascota> listar();
}
