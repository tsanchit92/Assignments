"use strict";
class Circle {
    printAll(Objects) {
        console.log('Circle ' + Objects);
    }
}
class Employee {
    printAll(Objects) {
        console.log('Employee: ' + Objects);
    }
}
let o = new Employee();
o.printAll('Vinnu');
let r = new Circle();
r.printAll('is drawn');
