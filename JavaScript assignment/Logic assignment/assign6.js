var x = "hello world in a frame";

function star(string)
{
  let arr = [];
  arr = string.split(" ");
console.log("*******");
    for (let j = 0; j <= arr.length; j++) 
    {
      console.log("*" + arr[j] + "*" );
    }
    console.log("******");
 
}
console.log(star(x));