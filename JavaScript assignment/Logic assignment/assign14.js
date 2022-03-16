var Arr[100]=[];
var i =0;
function largest(Array)
{
     var res=0;
    for(i=0;i<Array.length;i++)
    {
        if(Array[i]>res)
        {
            res=Array[i];
        }
    }
    console.log(res);
}
function smallest(Array)
{
    var res=0;
    for(i=0;i<Array.length;i++)
    {
        if(Array[i]<res)
        {
            res=Array[i];
        }
    }
    console.log(res);
}
function count(Array)
{
    var countEve=0;
    var countOdd=0;
    for(i=0;i<Array.length;i++)
    {
        if(Array[i]%2==0)
        {
            countEve++;
        }
        else
        {
            countOdd++;
        }
    }
    if(countEve > countOdd)
    {
        console.log("Even count is greater than odd count:" + countEve);
    }
    else
    {
        console.log("Odd count is greater than even count:" + countOdd);
    }
}
function avg(Array)
{
    var sum = 0;
    for(i=0;i<Array.length;i++)
    {
        sum+=Array[i];
    }
    console.log(sum);
    var avg =sum/Array.length;
    console.log(avg);

}