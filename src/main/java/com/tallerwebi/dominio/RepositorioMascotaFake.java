package com.tallerwebi.dominio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMascotaFake implements RepositorioMascota {

    private List<Mascota> mascotas = new ArrayList<>();

    @Override
    public void guardar(Mascota mascota) {
        mascotas.add(mascota);
    }

    @Override
    public List<Mascota> obtenerTodas() {
        return mascotas;
    }
}
