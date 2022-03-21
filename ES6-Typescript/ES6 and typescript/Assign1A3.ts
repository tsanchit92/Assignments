let id=1;
let title="Samosa";
let price=10;


var Order=
{
  id:id,
  title:title,
  price:price
};


const new_samosa = Object.assign({}, Order);
console.log(new_samosa);