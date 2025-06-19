package dev.saraiva.AirTravelManagement.Passageiros;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passageiros")
public class PassageirosController {

    // Criar passageiro
    @PostMapping("/criar")
    public String criarPassageiro() {
        return "Passageiro criado";
    }

    // Listar passageiro
    @GetMapping("/listar")
    public String listarPassageiro() {
        return "Passageiros listados";
    }

    // Listar passageiro por ID
    @GetMapping("/listar/{id}")
    public String listarPassageiroPorId() {
        return "Passageiro listado";
    }

    // Deletar passageiro
    @DeleteMapping("/deletar/{id}")
    public String deletarPassageiro() {
        return "Passageiro deletado";
    }

    // Atualizar passageiro
    @PutMapping("/atualizar/{id}")
    public String atualizarPassageiro() {
        return "Passageiro atualizado";
    }
}
