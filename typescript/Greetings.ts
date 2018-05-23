class Greetings{
private flag:boolean = true;

greet():void{
console.log("Helo world");
var str ='1';
var str2 : number = <number><any> str;
var num:number=10;
console.log(str2);
console.log(num);

}
}

var g = new Greetings();
g.greet();