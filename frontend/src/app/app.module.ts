import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { WelcomeComponent } from './components/welcome/welcome.component';
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent] /*2) starting component. By default, AppComponent. We change to welcomeComponent */
})
export class AppModule { }
