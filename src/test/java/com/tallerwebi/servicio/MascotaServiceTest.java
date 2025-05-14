package com.tallerwebi.servicio;

import com.tallerwebi.dominio.Mascota;
import com.tallerwebi.dominio.RepositorioMascotaFake;
import com.tallerwebi.dominio.ServicioMascota;
import com.tallerwebi.infraestructura.ServicioMascotaImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

public class MascotaServiceTest {

    @Test
    public void queSePuedaCrearUnaMascota() {

        RepositorioMascotaFake repositorio = new RepositorioMascotaFake();
        ServicioMascota servicio = new ServicioMascotaImpl(repositorio);

        Mascota mascota = new Mascota ("Firulais","Perro","Labrador");

        servicio.registrarMascota(mascota);

        List<Mascota> mascotasGuardadas = servicio.listar();
        assertThat(mascotasGuardadas, hasSize(1));
    }











}
