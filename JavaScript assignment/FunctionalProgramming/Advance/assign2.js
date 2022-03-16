var newArr;


function square(num)
{
    return num*num;
}
function sqrt(num)
{
   return Math.sqrt(num);
}
function map(Array,func(Array[i]),newArr)
{
    while(i<Array.length)
    {
        newArr.push(func(Array[i]));
        map(Array.slice(i+1,Array.length),func(Array[i+1]));
    }
}