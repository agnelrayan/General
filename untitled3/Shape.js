var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var Shape = (function () {
    function Shape(area) {
        this.area = area;
    }
    return Shape;
})();
var Child = (function (_super) {
    __extends(Child, _super);
    function Child(area) {
        _super.call(this, area);
    }
    Child.prototype.display = function () {
        return this.area;
    };
    return Child;
})(Shape);
var c1 = new Child(100);
c1.display();
console.log(c1.display());
