var expect  = require('chai').expect;
var request = require('request');

const assert = require('chai').assert;
//const sayHello = require('../app').sayHello;
const app = require('../app');

describe('Status and content', function() {
  describe ('Main page', function() {
    it('status', function(done){
      request('http://localhost:8080/', function(error, response, body) {
        expect(response.statusCode).to.equal(200);
        done();
      });
    });

    it('content', function(done) {
      request('http://localhost:8080/' , function(error, response, body) {
        expect(body).to.equal('Hello World');
        done();
      });
    });
  });

  describe ('About page', function() {
    it('status', function(done){
      request('http://localhost:8080/about', function(error, response, body) {
        expect(response.statusCode).to.equal(404);
        done();
      });
    });

  });
  
});


describe('App',function(){
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