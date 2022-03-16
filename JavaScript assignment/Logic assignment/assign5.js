var year=2022;
var count =0;
while(count!=20)
{
    year =year+1;
    if((year %400 ==0) || (year %4 ==0 && year%100!=0))
    {
        count++;
        console.log(year);
    }
}