package com.treino2.prova.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity //declarar entidade
@Data //getters e setters
@AllArgsConstructor //construtores instanciados
@NoArgsConstructor //construtores vazios
@Table(name = "tb_dono") //nomear tabela
public class DonoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private Integer idade;

    @OneToMany(mappedBy = "dono")//um para muito
    @JsonIgnore //ignora no requestbody
    private List<CarroModel> carros;
}
