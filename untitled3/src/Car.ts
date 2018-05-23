class Car{
    engine:string;

constructor(engine:string){
this.engine=engine;
}

display():void(){
console.log("Engine type"+this.engine)
}
}

var c1:Car = new Car("Tata");
console.log(c1.engine);
c1.display()