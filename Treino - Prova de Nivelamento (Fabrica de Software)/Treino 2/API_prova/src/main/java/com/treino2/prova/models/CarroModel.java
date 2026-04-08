package com.treino2.prova.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //declarar entidade
@Data //getters e setters
@AllArgsConstructor //construtores instanciados
@NoArgsConstructor //construtores vazios
@Table(name = "tb_carro") //nomear tabela
public class CarroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String marca;
    private String placa;

    @ManyToOne //muitos pra um
    @JoinColumn(name = "id_dono") //adicionando dono_id na coluna
    private DonoModel dono;
}
