class User{

name:string;
age:number;
dob:Date;

public constructor(name:string,age:number,dob:Date){
this.name=name;
this.age=age;
this.Date=Date;
}

}


 var dob:Date = new Date();
 var user:User = new User('ag',23, dob);
