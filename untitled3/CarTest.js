var chai_1 = require('chai');
//import mocha
var mocha_1 = require('mocha');
mocha_1.describe('testing engine array mutability', function () {
    it('It should run getEngine', function () {
        var car = new Car(["Tata;"]);
        chai_1.expect(car.getEngine()).to.equal('Tata');
    });
});
