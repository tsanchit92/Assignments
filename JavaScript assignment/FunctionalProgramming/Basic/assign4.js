function square(num)
{
return num*num;
}
function map(array,square)
{
let Newarray=[];
for(var i=0;i<array.length;i++)
 {
 Newarray.push(square(array[i]));
}


return Newarray;
}
console.log(map([1,2,3,4,5], square));
console.log(map([1, 4, 9, 16, 25], Math.sqrt));