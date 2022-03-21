function getNextArmstrong(n:number)
{
    let sum=0;
    let digits =0;
    let last=0;

    for(let i=n;i<100000;++i)
    {
        let temp =i;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        temp=i;
        while(temp>0)
        {
            last = temp%10;
            sum +=(Math.pow(last,digits));
            temp=temp/10;
        }
        if(i===sum)
        {
            console.log(i);
            break;
        }
        else{

            sum=0;
        }
        

    }
    for(let i=0;i<n;i++)
    {
       
        let temp =i;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        temp=i;
        while(temp>0)
        {
            last = temp%10;
            sum +=(Math.pow(last,digits));
            temp=temp/10;
        }
        if(i===sum)
        {
            console.log(i);
        }
    }
} 
getNextArmstrong(153);

