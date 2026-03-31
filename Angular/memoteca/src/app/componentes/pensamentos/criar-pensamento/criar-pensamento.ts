import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-criar-pensamento',
  imports: [FormsModule],
  templateUrl: './criar-pensamento.html',
  styleUrl: './criar-pensamento.css',
})
export class CriarPensamento implements OnInit {
  ngOnInit() {}

  pensamento = {
    id: 1,
    conteudo: 'Pensamento',
    autoria: 'Autoria',
    modelo: 'Modelo1',
  };

  criarPensamento(){
    alert("Pensamento Criado")
  }

  cancelar (){
    alert("Cancelado")
  }
}
