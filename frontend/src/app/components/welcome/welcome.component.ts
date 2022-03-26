import {Component, OnInit} from '@angular/core';
import {ConfigService} from "../../services/config.service";
import {Config} from "../../models/config";

@Component({
  selector: 'app-welcome', /*Need to be the same as @index.html*/
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  applicationName: string = ""

  constructor(private configService: ConfigService) { //incensing c

  }

  ngOnInit(): void {
    this.configService.getConfig().subscribe(value => this.applicationName = value.applicationName)
  }

}
