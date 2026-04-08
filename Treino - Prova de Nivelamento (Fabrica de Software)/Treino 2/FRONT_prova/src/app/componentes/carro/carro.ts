import { Component, OnInit, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-carro',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './carro.html',
})
export class CarroComponent implements OnInit {
  http = inject(HttpClient);
  apiCarros = 'http://localhost:8080/api/carro';
  apiDonos = 'http://localhost:8080/api/dono'; // URL extra para buscar o relacionamento

  carros: any[] = [];
  donos: any[] = [];

  // O SEGREDO DA RELAÇÃO: Iniciar com o dono vazio dentro dele
  carro: any = { dono: {} };

  ngOnInit() {
    this.listarCarros();
    this.listarDonos();
  }

  listarCarros() {
    this.http.get<any[]>(this.apiCarros).subscribe((res) => (this.carros = res));
  }

  listarDonos() {
    // Busca a lista de donos para usar na caixa de seleção (select)
    this.http.get<any[]>(this.apiDonos).subscribe((res) => (this.donos = res));
  }

  salvar() {
    if (this.carro.id) {
      this.http.put(this.apiCarros, this.carro).subscribe(() => {
        this.listarCarros();
        this.carro = { dono: {} };
      });
    } else {
      this.http.post(this.apiCarros, this.carro).subscribe(() => {
        this.listarCarros();
        this.carro = { dono: {} };
      });
    }
  }

  editar(item: any) {
    this.carro = { ...item };
  }

  deletar(id: number) {
    this.http.delete(`${this.apiCarros}/${id}`).subscribe(() => this.listarCarros());
  }
}
