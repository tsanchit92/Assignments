let arr=(array)=>{

    for(let i in array)
    {
        let arr2={name:array[i],length:array[i].length};
        console.log(arr2);
    }
}


let names=['Sanchit','Saurabh','Harshit','Siddartha'];
arr(names);


