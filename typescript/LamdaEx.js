var foo = function (x) { if (x % 2 == 0)
    return x; };
var m = [1, 2, 3, 4, 5, 6];
var f = m.filter(foo);
console.log(f);
