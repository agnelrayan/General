var Car = (function () {
    function Car(engine) {
        this.engine = engine;
    }
    Car.prototype.display = function () {
        console.log("Engine type:" + this.engine);
    };
    Car.prototype.getEngine = function () {
        //var ec: string[]=[];
        //ec[0] = this.engine[0];
        //return ec;
        return this.engine;
    };
    return Car;
})();
exports.Car = Car;
var c1 = new Car(["Tata"]);
var e = c1.getEngine();
e[0] = "Tata2";
console.log(c1.engine);
c1.display();
c1.getEngine();
c1.display();
