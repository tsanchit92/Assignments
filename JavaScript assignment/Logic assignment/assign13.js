var sum=0;
var Arr=[12,13,24,42,65,89,90,56];
function funA(Array)
{
    for(let i=0;i<Array.length;i++)
    {
        sum+=Array[i];
    }
     console.log(sum);
}
funA(Arr);
function funB(Array)
{
    let i=0;
        while(i < Array.length)
        {
            sum += Array[i];
            i++;
        }
        console.log(sum);

}
funB(Arr);
function funC(Array)
{
    var i=0;
    do{
        sum+=Array[i];
        i++;
    }
    while(i<Array.length)
    console.log(sum);
}
funC(Arr);
