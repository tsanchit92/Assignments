function BankAccount(accountNumber,accountHolderName,accountBalance,isSalary,odLimit,amount)
{
this.accountNumber=accountNumber;
this.accountHolderName=accountHolderName;
this.accountBalance=accountBalance;
this.isSalary=isSalary;
this.odLimit=odLimit;
this.amount=amount;


if(this.isSalary==true)
{
   if(this.accountBalance>this.amount)
     {
         this.accountBalance=this.accountBalance-(this.amount);
         console.log(this.accountBalance);
     }
    else
    {
    console.log("insuufficient funds");
    }
}
else
{
     if(this.amount < this.accountBalance + this.odLimit)
      {
                  this.accountBalance =this.accountBalance- this.amount;
                  console.log(this.accountBalance);
      }
     else
     {
     console.log('Insufficient Funds');
     }
}
}
Savings=new BankAccount(100,"Sanchit Tripathi",1000,true,0,100);
Current=new BankAccount(200,"Sanchit Tripathi",2000,false,100,200);