var User = (function () {
    function User(name, age, dob) {
        this.name = name;
        this.age = age;
        this.Date = Date;
    }
    return User;
})();
var dob = new Date();
var user = new User('ag', 23, dob);
