var str="askaiye bachj tygdsvd"
function latin_changer()
{
    
    arr=str.split(" ");
    len=arr.length;
    for(let i =0;i<len;i++)
    {
        temp=arr[i].charAt[0];
        for(let j=1;j<arr[i].length;j++)
        {
            
            arr[i].charAt[j-1]=arr[i].charAt[j];
            
        }
        arr[i].charAt[arr[i].length-1]=temp;
        arr[i].concat("ay");
    }
    str=arr.toString();
    console.log(str);
}