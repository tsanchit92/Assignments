"use strict";
function add(a, b) {
    a = a + b;
    return a;
}
console.log(add(5, 5));
function userFriends(username, ...users) {
    console.log(username, ...users);
}
let arr = ['Siddhartha', 'Harshit', 'Saurabh'];
userFriends("Sanchit", arr);
function printCapitalNames(...name) {
    const uppercased = name.map(name => name.toUpperCase());
    console.log(uppercased);
}
let array = ['Siddhartha', 'Harshit', 'Saurabh'];
printCapitalNames(...array);
