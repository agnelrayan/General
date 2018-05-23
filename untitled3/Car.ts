export class Car{
    engine:string[];

constructor(engine:string[]){
this.engine=engine;
}

display():void{
console.log("Engine type:"+this.engine)
}

getEngine():string[]{
//var ec: string[]=[];
//ec[0] = this.engine[0];
//return ec;
 return this.engine
}

}
var c1:Car = new Car(["Tata"]);
var e: string[] = c1.getEngine()
e[0] = "Tata2"
console.log(c1.engine);
c1.display()
c1.getEngine()
c1.display()