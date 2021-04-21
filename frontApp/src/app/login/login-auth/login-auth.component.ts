import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login-auth',
  templateUrl: './login-auth.component.html',
  styleUrls: ['./login-auth.component.css']
})
export class LoginAuthComponent implements OnInit {

  user = '';
  password = '';

  constructor(private route: Router, private loginService: LoginService) { }

  ngOnInit(): void {
    localStorage.clear();
  }

  login() {
    this.loginService.post(this.user, this.password).subscribe(r => {
      localStorage.setItem('access_token_ads04',r.access_token);
      localStorage.setItem('login',r.login);
      this.route.navigate(['/listPerson'])
    })
  }
}
