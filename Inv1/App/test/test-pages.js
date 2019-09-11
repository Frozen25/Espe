var expect  = require('chai').expect;  ///Needed for Asserts
var request = require('request');   // Needed for sending requests

const assert = require('chai').assert;  /// library used for unit testing
//const sayHello = require('../app').sayHello;
const app = require('../app');


//// Verifies each part of the site's webpage, and also its contents.

// verifies status of webpage
describe('Status and content', function() {
  describe ('Main page', function() {
    it('status', function(done){
      request('http://localhost:8080/', function(error, response, body) {
        expect(response.statusCode).to.equal(200);
        done();
      });
    });
    /// verifies content of "helloworld" on the page
    it('content', function(done) {
      request('http://localhost:8080/' , function(error, response, body) {
        expect(body).to.equal('Hello World');
        done();
      });
    });
  });

  /// verifies the about page, since it has't been created yet, It returns error 404
  describe ('About page', function() {
    it('status', function(done){
      request('http://localhost:8080/about', function(error, response, body) {
        expect(response.statusCode).to.equal(404);
        done();
      });
    });

  });
  
});

// tests every function one by one
describe('App',function(){
  // tests the function result and its type
  describe('Say Hello Function',function(){
    it('app should return hello', function(){
      let result = app.sayHello();
      assert.equal(result,'hello');
    });
    it('sayHello should return type string',function(){
      let result = (app.sayHello());
      assert.typeOf(result,'string');

    });
  });
    
});