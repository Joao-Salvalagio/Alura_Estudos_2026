import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dono } from './dono';

describe('Dono', () => {
  let component: Dono;
  let fixture: ComponentFixture<Dono>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Dono],
    }).compileComponents();

    fixture = TestBed.createComponent(Dono);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
