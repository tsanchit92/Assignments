function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

let a=new person("Sanchit","Tripathi");
console.log("FirstName: "+a.firstName);
console.log("LastName: "+a.lastName);
a.lastName="Tiwari";
console.log("FirstName: "+a.firstName);
console.log("LastName: "+a.lastName);

console.log("MiddleName: "+a.middleName);
a.middleName="Ramesh";
console.log("MiddleName: "+a.middleName);
