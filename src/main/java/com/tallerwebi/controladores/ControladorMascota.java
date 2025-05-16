package com.tallerwebi.controladores;

import com.tallerwebi.dominio.Mascota;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class ControladorMascota {

    private List<Mascota> mascotas = new ArrayList<>();

    @GetMapping("/mascotas")
    public String verMascotas(Model model) {
        model.addAttribute("mascotas", mascotas);
        return "mascotas";
    }

    @GetMapping("/mascotas/nueva")
    public String mostrarFormularioMascota(Model model) {
        model.addAttribute("mascota", new Mascota());
        return "formulario-mascota";
    }

    @PostMapping("/mascotas")
    public String guardarMascota(@ModelAttribute Mascota mascota) {
        mascota.setId((int) (mascotas.size() + 1));
        mascotas.add(mascota);
        return "redirect:/mascotas";
    }


}
