package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Mascota;
import com.tallerwebi.dominio.RepositorioMascota;
import com.tallerwebi.dominio.RepositorioMascotaFake;
import com.tallerwebi.dominio.ServicioMascota;

import java.util.List;

public class ServicioMascotaImpl implements ServicioMascota {

    private RepositorioMascota repositorio;

    public ServicioMascotaImpl(RepositorioMascotaFake repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void registrarMascota(Mascota mascota) {
        repositorio.guardar(mascota);
    }

    @Override
    public List<Mascota> listar() {
        return repositorio.obtenerTodas();
    }
}
