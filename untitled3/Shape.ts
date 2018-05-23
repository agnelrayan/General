class Shape{
    area:number

    constructor(area:number){
   this.area=area

}


}
class Child extends Shape{
   constructor(area:number){
   super(area)

}

display():number{
return this.area
}

}

var c1:Child = new Child(100)
c1.display()
console.log(c1.display())