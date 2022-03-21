class fibonnacci
{
    previousNo: number;
    currentNo: number;
    next(previousNo,currentNo)
    {
        
         console.log(previousNo+currentNo);
    }
}

let f=new fibonnacci();
f.next(5,6);