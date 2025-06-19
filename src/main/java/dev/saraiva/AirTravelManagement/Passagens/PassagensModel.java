package dev.saraiva.AirTravelManagement.Passagens;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dev.saraiva.AirTravelManagement.Passageiros.PassageirosModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_passagens")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PassagensModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "destino")
    private String destino;

    @OneToMany(mappedBy = "passagem")
    @JsonIgnore
    private List<PassageirosModel> passageiro;
}
