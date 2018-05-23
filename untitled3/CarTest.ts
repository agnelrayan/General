import {Car} from './Car';
import {expect} from 'chai/lib/Chai'
//import mocha

import {describe} from 'mocha';

describe('testing engine array mutability',()=>{
it('It should run getEngine',()=>{

 var car = new Car(["Tata;"])
expect(car.getEngine()).to.equal('Tata')

it('It should not Change when returned array changed ',()=>{

   var car = new Car(["Tata2"])
   var


})

});
});