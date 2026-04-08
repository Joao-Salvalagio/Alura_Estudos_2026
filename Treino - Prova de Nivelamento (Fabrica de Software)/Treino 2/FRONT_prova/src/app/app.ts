import { Component, signal } from '@angular/core';
import { CarroComponent } from './componentes/carro/carro';
import { DonoComponent } from './componentes/dono/dono';

@Component({
  selector: 'app-root',
  imports: [CarroComponent, DonoComponent],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('FRONT_prova');
}
