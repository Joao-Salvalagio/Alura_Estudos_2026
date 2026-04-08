package com.treino1.prova.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_livro")
public class LivroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer anoPublicacao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private AutorModel autor;
}
