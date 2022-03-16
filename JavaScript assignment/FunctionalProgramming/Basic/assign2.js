function compose(square,double,num)
{
return square(double(num));
}

function  square(x)
{
 return(x*x);
}
function double(x)
{
 return(x*2);
}

var f1 = compose(square, double,5);
console.log(f1);
var f1 = compose(square, double,10);
console.log(f1);
var f2 = compose(double, square,5);
console.log(f2);
var f2 = compose(double, square,10);
console.log(f2);