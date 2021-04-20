import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  login: any;
  pass: any;

  constructor(private route: Router) { }

  ngOnInit(): void {
  }

  logar() {
    localStorage.setItem('access_token_ads04','5745db75-6919-4050-a662-9583265e1ffa');
    this.route.navigate(['/listPerson']);
  }
}
