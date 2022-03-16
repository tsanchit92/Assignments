function fib(n)
{
    let a = 0, b = 1, c, i;
    if( n == 0)
       console.log(a);
       
    for(i = 2; i <= n; i++)
    {
    c = a + b;
    a = b;
    b = c;
    console.log(b) ;
    }
    
}
let n = 100;
     
fib(n);