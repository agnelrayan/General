var v1 = function(a){
a();
}

var v2 =function(){
console.log('Helo');
};
v1(v2);