import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class GuardGuard implements CanActivate {

  loggedInStatus : boolean = false;

  constructor(private authService:AuthService, private router:Router){ }
  
  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable <boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      
      this.authService.loggedIn$.subscribe(
       (status) => {
         this.loggedInStatus = status;
       });
    return this.loggedInStatus;

 if (this.loggedInStatus) {
    return true; }
   else {
    this.router.navigate(['/login']);
    return false;
  }

}}