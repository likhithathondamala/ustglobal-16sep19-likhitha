import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowalllibrarianComponent } from './showalllibrarian.component';

describe('ShowalllibrarianComponent', () => {
  let component: ShowalllibrarianComponent;
  let fixture: ComponentFixture<ShowalllibrarianComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowalllibrarianComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowalllibrarianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
