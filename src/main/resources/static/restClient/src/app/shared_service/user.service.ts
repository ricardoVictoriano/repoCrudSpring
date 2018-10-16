import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';


import 'rxjs/add/operator/map';
import { Observable } from 'rxjs';
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/map';
import 'rxjs/operator/catch';
import 'rxjs/Rx';
import { User } from "../user";
//import { map } from "rxjs/operators";



@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseUrl: string = 'http://localhost:8080/api';
  private headers = new Headers({ 'Content-Type': 'application/json' });
  private options = new RequestOptions({ headers: this.headers });

  constructor(private _http: Http) { }


  //GET ALL USERS
  getUsers() {
    return this._http.get(this.baseUrl + '/users', this.options).map((response: Response) => response.json()).catch(this.errorHandler);
    //return this._http.get(this.baseUrl + '/users', this.options).pipe(map((response: Response) => response.json())).catch(this.errorHandler);
  }

  //GET USER BY ID
  getUser(id:Number) {
    return this._http.get(this.baseUrl + '/users'+id, this.options).map((response: Response) => response.json()).catch(this.errorHandler);
    //return this._http.get(this.baseUrl + '/users', this.options).pipe(map((response: Response) => response.json())).catch(this.errorHandler);
  }

  //DELETE USER BY ID
  deleteUser(id:Number) {
    return this._http.delete(this.baseUrl + '/users'+id, this.options).map((response: Response) => response.json()).catch(this.errorHandler);
    //return this._http.get(this.baseUrl + '/users', this.options).pipe(map((response: Response) => response.json())).catch(this.errorHandler);
  }

  //CREATE AN USER
  createUser(user:User) {
    return this._http.post(this.baseUrl + '/users',JSON.stringify(user), this.options).map((response: Response) => response.json()).catch(this.errorHandler);
    //return this._http.get(this.baseUrl + '/users', this.options).pipe(map((response: Response) => response.json())).catch(this.errorHandler);
  }

  //UPDATE AN USER
  updateUser(user:User) {
    return this._http.put(this.baseUrl + '/users',JSON.stringify(user), this.options).map((response: Response) => response.json()).catch(this.errorHandler);
    //return this._http.get(this.baseUrl + '/users', this.options).pipe(map((response: Response) => response.json())).catch(this.errorHandler);
  }

  errorHandler(error:Response) {
    return Observable.throw(error||"SERVER ERROR");

  }



}
