class Calculator{
    sum(x:number, y:number, ...args:any[]):number{
        var s:number = 0 ;   var a:number = 0
        for(a of args){
            s = s + a
        }
        return x+y+s;
    }
}
let v:Calculator = new Calculator();
console.log(v.sum(4,5,4,5,6,4,4,3))
