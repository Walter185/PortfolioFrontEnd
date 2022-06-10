import { HttpErrorResponse, HttpResponse } from "@angular/common/http";
import { Component, OnInit } from "@angular/core";
import { NgForm } from "@angular/forms";
import { Aboutme } from '../../model/aboutme.model';
import { AboutmeService } from '../../_services/aboutme.service';
import { TokenStorageService } from "src/app/_services/token-storage.service";

@Component({
  selector: 'app-aboutme',
  templateUrl: './aboutme.component.html',
  styleUrls: ['./aboutme.component.css']
})
export class AboutmeComponent implements OnInit {

  public aboutme:Aboutme | undefined;
  public editAboutme:Aboutme | undefined;
  public deleteAboutme:Aboutme | undefined;
  currentUser: any;
  private roles: string[];
  isLoggedIn = false;
  showAdminBoard = false;
  ShowUserBoard = false;
  showModeratorBoard = false;
  username: string;

  constructor(private aboutmeService:AboutmeService, private tokenStorageService:TokenStorageService) { }

  ngOnInit(): void {
    this.getAbouts();
    this.currentUser = this.tokenStorageService.getUser();
    this.isLoggedIn = !!this.tokenStorageService.getToken();

    if (this.isLoggedIn) {
      const user = this.tokenStorageService.getUser();
      this.roles = user.roles;

      this.showAdminBoard = this.roles.includes('ROLE_ADMIN');
      this.showModeratorBoard = this.roles.includes('ROLE_MODERATOR');
      this.ShowUserBoard = this.roles.includes('ROLE_USER');

      this.username = user.username;
    }
  }
    
  
      public getAbouts():void{ 
        this.aboutmeService.getAboutme().subscribe({
          next: (Response: Aboutme) => {
          this.aboutme=Response;
        },
        error:(error:HttpErrorResponse)=>{
          alert(error.message);
        }
        })
      }
    
      public onOpenModal(mode:String, aboutme?:Aboutme):void{
        const container=document.getElementById('main-container');
        const button=document.createElement('button');
        button.type='button';
        button.style.display='none';
        button.setAttribute('data-toggle','modal');
        if(mode==='add'){
          button.setAttribute('data-target','#addAboutmeModal');
        } else if (mode==='edit'){
          this.editAboutme=this.aboutme;
          button.setAttribute('data-target','#editAboutmeModal');
        }
        container?.appendChild(button);
        button.click();
        }

  public onUpdateAboutme(aboutme:Aboutme){
    this.editAboutme=aboutme;
    document.getElementById('add-aboutme-form')?.click();
    this.aboutmeService.updateAboutme(aboutme).subscribe({
      next: ( response: Aboutme) =>{
        console.log(response);
        this.getAbouts();
       },
       error:(error:HttpErrorResponse)=>{
         alert(error.message);
       }
      })
    }
       
    public onAddAboutme(addForm:NgForm):void{
      document.getElementById('add-aboutme-form')?.click();
      this.aboutmeService.addAboutme(addForm.value).subscribe({
        next:(response: Aboutme) =>{
          console.log(response);
          this.getAbouts();
          addForm.reset();
        },
        error:(error:HttpErrorResponse)=>{
          alert(error.message);
          addForm.reset();
        }
    })
  }
  
  public onDeleteAboutme(idIntroduccion: number):void{
    this.aboutmeService.deleteAboutme(idIntroduccion).subscribe({
      next: (response:void) =>{
        console.log(response);
        this.getAbouts();
       },
       error:(error:HttpErrorResponse)=>{
         alert(error.message);
       }
    })
  }
 
}
  

