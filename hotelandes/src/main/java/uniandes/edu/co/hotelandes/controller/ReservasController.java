package uniandes.edu.co.hotelandes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.hotelandes.modelo.Reserva;
import uniandes.edu.co.hotelandes.repositorio.ReservaRepository;

@Controller
public class ReservasController {

    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping("/reservas")
    public String reservas(Model model) {
        model.addAttribute("reservas", reservaRepository.darReservas());
        return "reservas";
    }

    @GetMapping("/reservas/new")
    public String reservaForm(Model model) {
        model.addAttribute("reserva", new Reserva());
        return "reservaNuevo";
    }

    @PostMapping("/reservas/new/save")
    public String reservaGuardar(@ModelAttribute Reserva reserva) {
        reservaRepository.insertReserva(reserva.getFecha_hora_inicio(), reserva.getFecha_hora_fin(), reserva.getPrecio());
        return "redirect:/reservas";
    }

    @GetMapping("/reservas/{id}/edit")
    public String reservaEditarForm(@PathVariable("id") Integer id, Model model) {
        Reserva reserva = reservaRepository.darReserva(id);
        if (reserva != null) {
            model.addAttribute("reserva", reserva);
            return "reservaEditar";
        }

        else {
            return "redirect:/reservas";
        }
    }
    
    @PostMapping("/reservas/{id}/edit/save")
    public String reservaEditarGuardar(@PathVariable("id") Integer id, @ModelAttribute Reserva reserva) {
        reservaRepository.updateReservas(id, reserva.getFecha_hora_inicio(), reserva.getFecha_hora_fin(), reserva.getPrecio());
        return "redirect:/reservas";
    }


    @GetMapping("/reservas/{id}/delete") 
    public String reservaEliminar(@PathVariable("id") Integer id) { 
        reservaRepository.deleteReserva(id);
        return "redirect:/reservas";   
    }
}
