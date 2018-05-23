var Greetings = (function () {
    function Greetings() {
        this.flag = true;
    }
    Greetings.prototype.greet = function () {
        console.log("Helo world");
        var str = '1';
        var str2 = str;
        var num = 10;
        console.log(str2);
        console.log(num);
    };
    return Greetings;
})();
var g = new Greetings();
g.greet();
