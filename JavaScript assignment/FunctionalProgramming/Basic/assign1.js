function composedValue(square,double,num)
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
 console.log(composedValue(square,double,5));