import { Component, OnInit, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-dono',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './dono.html',
})
export class DonoComponent implements OnInit {
  http = inject(HttpClient);
  api = 'http://localhost:8080/api/dono';

  donos: any[] = [];
  dono: any = {};

  ngOnInit() {
    this.listar();
  }

  listar() {
    this.http.get<any[]>(this.api).subscribe((res) => (this.donos = res));
  }

  salvar() {
    // 1. Trava de segurança: Só salva se tiver um nome digitado
    if (!this.dono.nome) {
      alert('Por favor, digite pelo menos o nome do dono!');
      return;
    }

    // 2. Copiamos os dados e limpamos a tela NA MESMA HORA para evitar o clique duplo
    const dadosParaSalvar = { ...this.dono };
    this.dono = {};

    // 3. Envia os dados copiados para o banco
    if (dadosParaSalvar.id) {
      this.http.put(this.api, dadosParaSalvar).subscribe(() => this.listar());
    } else {
      this.http.post(this.api, dadosParaSalvar).subscribe(() => this.listar());
    }
  }

  editar(item: any) {
    // O ... clona o item para o formulário
    this.dono = { ...item };
  }

  deletar(id: number) {
    this.http.delete(`${this.api}/${id}`).subscribe(() => this.listar());
  }
}
