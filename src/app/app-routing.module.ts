import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardUserComponent } from './board-user/board-user.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { IntroComponent } from './components/intro/intro.component';
import { EducationComponent } from './components/education/education.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { SkillComponent } from './components/skill/skill.component';
import { ProjectComponent } from './components/project/project.component';
import { FooterComponent } from './components/footer/footer.component';
import { HardskillComponent } from './components/hardskill/hardskill.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'intro',  component: IntroComponent },
  { path: 'experience', component: ExperienceComponent },
  { path: 'education', component: EducationComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'Skills', component: SkillComponent },
  { path: 'hard', component: HardskillComponent },
  { path: 'proyectos', component: ProjectComponent, },
  { path: 'profile', component: ProfileComponent, },
  { path: 'user', component: BoardUserComponent,},
  { path: 'info', component: FooterComponent },
  { path: 'mod', component: BoardUserComponent },
  { path: 'admin', component: BoardAdminComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
