"use strict";
const p = new Promise((resolve, reject) => {
    const a = parseInt(prompt('Enter the value of a '));
    resolve(a);
});
const q = new Promise((resolve, reject) => {
    const b = parseInt(prompt('Enter the value of b '));
    resolve(b);
});
Promise.all([
    [p, q]
]).then(values => {
    console.log(`Value:${values}`);
    console.log(`Sum:${values[0] + values[1]}`);
}).catch((messages) => {
    console.log("Error");
});
