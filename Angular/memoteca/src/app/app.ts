import { Component, signal } from '@angular/core';
import { Cabecalho } from './componentes/cabecalho/cabecalho';
import { Rodape } from './componentes/rodape/rodape';
import { CriarPensamento } from './componentes/pensamentos/criar-pensamento/criar-pensamento';

@Component({
  selector: 'app-root',
  imports: [Cabecalho, Rodape, CriarPensamento],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('memoteca');
}
