const n=prompt("Enter the number","");
var sum=0;
for (let index = 0; index <= n; index++) 
{
    if(index%3==0 || index%5==0)
    {
    
    sum+=index;
    }
}
    console.log(sum);