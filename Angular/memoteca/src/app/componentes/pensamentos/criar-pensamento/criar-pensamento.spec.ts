import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CriarPensamento } from './criar-pensamento';

describe('CriarPensamento', () => {
  let component: CriarPensamento;
  let fixture: ComponentFixture<CriarPensamento>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CriarPensamento],
    }).compileComponents();

    fixture = TestBed.createComponent(CriarPensamento);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
