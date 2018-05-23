class Printer{

    doPrint():void{
console.log("In Printer")
}

display():void{
console.log("In Display")
}

}

class StringPrinter extends Printer{

doPrint():void{
super.doPrint()

console.log("In child")
}

}

var p: Printer = new StringPrinter()
p.doPrint()

var p2: Printer = new Printer()
p2.display()
