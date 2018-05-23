
var str1="a";
var str2 ="b";
var str3 = "return a+b";


var myf = new Function(str1,str2,str3);

console.log(myf(str1,str2));