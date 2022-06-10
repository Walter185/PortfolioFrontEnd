import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Aboutme } from '../model/aboutme.model';


@Injectable({
  providedIn: 'root'
})
export class AboutmeService {
  private apiServeUrl='http://localhost:8080';
  
  constructor(private http:HttpClient) { }

public getAboutme():Observable<Aboutme>{
  return this.http.get<Aboutme>(`${this.apiServeUrl}/introduccion/id/1`);
}
public addAboutme(aboutme: Aboutme): Observable<Aboutme>{
  return this.http.post<Aboutme>(`${this.apiServeUrl}/introduccion/add`,aboutme);
}
public updateAboutme(aboutme: Aboutme): Observable<Aboutme>{
  return this.http.put<Aboutme>(`${this.apiServeUrl}/introduccion/update`,aboutme);
}
public deleteAboutme(aboutmeId: number): Observable<void>{
  return this.http.delete<void>(`${this.apiServeUrl}/introduccion/delete/${aboutmeId}`);
} 
}