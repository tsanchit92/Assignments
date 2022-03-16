function coinFlip() {
    return(Math.random() < 0.3) ? 'Heads' : 'Tails'; 
}

var howManyTimes=500;
var countHeads=0; 
for (var i=0; i<howManyTimes;i++){
if (coinFlip()==='Heads'){
 countHeads++;
}
}
console.log("headsratio:"+(countHeads/howManyTimes));