var count =0;
var max=0;
var j =0;
var str="abbacdefabhjk";
var strRes;
function fun(string)
{
    for(let i=0;i<str.length;i++)
    {
        if(str.charAt(i)=="a" || str.charAt(i)=="b")
        {
            if(count>max)
            {
                
                max=count;
                strRes=str.substring(j,i-1);
                j=i;
                count=0;
            }
            
        }
        else
        {
             count++;
        }   
        
    }
    console.log(strRes);

}
fun(str);