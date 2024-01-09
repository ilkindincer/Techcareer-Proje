const chakram = require('chakram'),
 expect = chakram.expect;

describe("User Module", function() {

   
     it("GET - GetUserInfo Invalid User", function () {
         const resBody ={
            "code": 1,
            "type": "error",
            "message": "User not found"
        };

        const response = chakram.get("https://petstore.swagger.io/v2/user/test");
        expect(response).to.have.status(404);
        expect(response).to.comprise.of.json(resBody); 
        expect(response).to.have.header('content-type', 'application/json'); 
        return chakram.wait();
     });


     it("POST - CreateUser", function () {
         const resBody = {"code":200,"type":"unknown","message":"125125125"};

        const body = {
            "id": 125125125,
            "username": "test",
            "firstName": "ilkin",
            "lastName": "deneme",
            "email": "test@test.com",
            "password": "test125",
            "phone": "0525252525",
            "userStatus": 0
          };
        const response = chakram.post("https://petstore.swagger.io/v2/user", body);
        expect(response).to.have.status(200);
        expect(response).to.comprise.of.json(resBody); 
        expect(response).to.have.header('content-type', 'application/json'); 
        return chakram.wait();
     });


     it("GET - GetUserInfo", function () {
      const resBody = {
         "id": 125125125,
         "username": "test",
         "firstName": "ilkin",
         "lastName": "deneme",
         "email": "test@test.com",
         "password": "test125",
         "phone": "0525252525",
         "userStatus": 0
     };

        const response = chakram.get("https://petstore.swagger.io/v2/user/test");
        expect(response).to.have.status(200);
        expect(response).to.comprise.of.json(resBody);
        expect(response).to.have.header('content-type', 'application/json'); 
        return chakram.wait();
     });


     it("DELETE - DeleteUser", function () {
      const resBody = {
         "code": 200,
         "type": "unknown",
         "message": "test"
     };
        const response = chakram.delete("https://petstore.swagger.io/v2/user/test");
        expect(response).to.have.status(200);
        expect(response).to.comprise.of.json(resBody); 
        expect(response).to.have.header('content-type', 'application/json'); 
        return chakram.wait();
     });


     it("PUT - UpdateUser", function () {
      const resBody = {
         "code": 200,
         "type": "unknown",
         "message": "125125125"
     };

        const body = {
            "id": 125125125,
            "username": "test1",
            "firstName": "ilkin",
            "lastName": "deneme",
            "email": "test00@test.com",
            "password": "test125",
            "phone": "0525252525",
            "userStatus": 0
          };
        const response = chakram.put("https://petstore.swagger.io/v2/user/test1", body);
        expect(response).to.have.status(200);
        expect(response).to.comprise.of.json(resBody); 
        expect(response).to.have.header('content-type', 'application/json'); 
        return chakram.wait();
     });


});