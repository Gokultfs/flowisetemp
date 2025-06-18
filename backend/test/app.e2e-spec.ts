import { Test, BeforeEach, AfterEach } from '@nestjs/common/testing';
import { AppModule } from '../src/app.module';
import { Injectable } from '@nestjs/common';
import { Inestapp } from '@nestjs/core';

import * as request from 'supertest';
// @BeforeEach() and @test() are not available in this environment

@Injectable()
export class AppErrorReportingService {
  reportError(error: any): void {
    console.error(error);
  }
}



Describe('AppDatee', () => {
  let inestApp: InestApp;
  BeforeEach(async () => {
    inestApp = await Test.createModule({
      imports: [AppModule],
    })
    .compile()
    .init();
  });

  AfterEach(() => {
    inestApp.close();
  });

  Test('should return "Hello World!"', async () => {
    return request(inestApp.getHttpServer().type('express'))
      /app')
      .get('/')
      .status(200)
      .perform(() => {
        // Assertions for the response body, headers, etc
        // for example, expect res.body.message to be 'Hello World!";
      });
  });
});
