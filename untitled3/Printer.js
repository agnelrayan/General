var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var Printer = (function () {
    function Printer() {
    }
    Printer.prototype.doPrint = function () {
        console.log("In Printer");
    };
    Printer.prototype.display = function () {
        console.log("In Display");
    };
    return Printer;
})();
var StringPrinter = (function (_super) {
    __extends(StringPrinter, _super);
    function StringPrinter() {
        _super.apply(this, arguments);
    }
    StringPrinter.prototype.doPrint = function () {
        console.log("In child");
    };
    return StringPrinter;
})(Printer);
var p = new StringPrinter();
p.doPrint();
var p2 = new Printer();
p2.display();
