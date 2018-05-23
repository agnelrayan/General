var Calculator = (function () {
    function Calculator() {
    }
    Calculator.prototype.sum = function (x, y) {
        var args = [];
        for (var _i = 2; _i < arguments.length; _i++) {
            args[_i - 2] = arguments[_i];
        }
        var s = 0;
        var a = 0;
        for (var _a = 0; _a < args.length; _a++) {
            a = args[_a];
            s = s + a;
        }
        return x + y + s;
    };
    return Calculator;
})();
var v = new Calculator();
console.log(v.sum(4, 5, 4, 5, 6, 4, 4, 3));
