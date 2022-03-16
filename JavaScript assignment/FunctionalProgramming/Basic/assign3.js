function isEven(num)
{
return(num%2 == 0);
}
function find(array,isEven)
{
let Newarray=[]
for(var i=0;i<array.length;i++)
{
if(isEven(array[i])==true)
{
Newarray.push(array[i]);
}
}
return Newarray[0];
}