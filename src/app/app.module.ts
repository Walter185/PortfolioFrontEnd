import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { BoardModeratorComponent } from './board-moderator/board-moderator.component';
import { BoardUserComponent } from './board-user/board-user.component';
import { authInterceptorProviders } from './_helpers/auth.interceptor';
import { AboutmeComponent } from './components/aboutme/aboutme.component';
import { FooterComponent } from './components/footer/footer.component';
import { HeadComponent } from './components/head/head.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ReactiveFormsModule } from '@angular/forms';
import { fromEventPattern } from 'rxjs';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { ProjectComponent } from './components/project/project.component';
import { CommonModule } from '@angular/common';
import { MatProgressBar, MatProgressBarModule } from '@angular/material/progress-bar';
import { MatProgressBarLocation } from '@angular/material/progress-bar';
import { ExperienceComponent } from './components/experience/experience.component';
import { EducationComponent } from './components/education/education.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { SoftskillComponent } from './components/softskill/softskill.component';
import { HardskillComponent } from './components/hardskill/hardskill.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { AuthService } from './_services/auth.service';
import { GuardGuard } from './_services/guard.guard';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ProfileComponent,
    AboutmeComponent,
    BoardAdminComponent,
    BoardModeratorComponent,
    BoardUserComponent,
    FooterComponent,
    HeadComponent,
    ProjectComponent,
    ExperienceComponent,
    EducationComponent,
    SoftskillComponent,
    HardskillComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    CommonModule,
    MatProgressBarModule,
    NgbModule,
    NgCircleProgressModule.forRoot({})
  ],

  providers: [authInterceptorProviders,AuthService, GuardGuard],
  bootstrap: [AppComponent]
})

export class AppModule { }
