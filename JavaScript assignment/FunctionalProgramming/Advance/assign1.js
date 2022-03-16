function isEven(num)
{
return(num%2 == 0);
}
function find(arr, fun) {
    var i=0;
    while (i<arr.length) {
        if (fun(arr[i]))
        {
            console.log(arr[i]);
            break;
        }

        else{
        return find(arr.slice(i+1, arr.length), fun(arr[i+1]));
        }
    }
};