package com.tallerwebi.servicio;

import com.tallerwebi.dominio.Mascota;
import com.tallerwebi.dominio.RepositorioMascotaFake;
import com.tallerwebi.dominio.ServicioMascota;
import com.tallerwebi.infraestructura.ServicioMascotaImpl;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MascotaServiceTest {

    @Test
    public void queSePuedaCrearUnaMascota() {

        RepositorioMascotaFake repositorio = new RepositorioMascotaFake();
        ServicioMascota servicio = new ServicioMascotaImpl(repositorio);

        Mascota mascota = new Mascota ("Firulais","Perro","Labrador");

        servicio.registrarMascota(mascota);

        assertThat(repositorio.obtenerMascotasGuardadas()).containsExactly(mascota);

    }











}
