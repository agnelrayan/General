var global_num = 12;
var Scope = (function () {
    function Scope() {
        this.num_val = 13;
        this.global_num = 10;
        this.local_num = 140;
    }
    return Scope;
})();
var num = new Scope();
console.log(num instanceof Scope);
