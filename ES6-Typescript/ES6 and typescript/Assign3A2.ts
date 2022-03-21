class Account
{
    balance1: any;

    constructor(id,name,balance1)
    {
        this.id=id;
        this.name=name;
        this.balance1=balance1;
    }
}
    class SavingsAccount extends Account {
    constructor(id,balance1,name)
    {
        super(id,name,balance1);
        this.id=id;
        this.name=name;
        this.balance1=balance1;
    }
    getInterest()
        {
            let balance2=this.balance1*0.2;
            console.log("Interest for Savings account",balance2);

           return balance2;
        }  

        getCash_credit()
        {
            let balance3=this.balance1*0.1+this.balance1;
            if(this.balance1==0)
            {
            let balance3=1000+this.balance1;
            console.log("Interest for Savings account",balance3);
            

            return balance3;
            }
            else
            console.log("Balance for Savings account",balance3);

            return balance3;
        }
        showBalance = ()=>{let b = this.getInterest()+this.getCash_credit();
            console.log("---------");
            console.log('the balance in your savings account is: '+b);}

}

    class CurrentAccount extends SavingsAccount {
        constructor(id,balance1,name)
        {
            super(id,name,balance1);
            this.id=id;
            this.name=name;
            this.balance1=balance1;
        }


        getInterest()
        {
            let balance2=this.balance1*0.1;
            console.log("Interest for Current account",balance2);
            return balance2;
        }  

        getCash_credit()
        {
            let balance3=this.balance1*0.1+this.balance1;
            
        
            if(this.balance1==0)
            {
            let balance3=2000+this.balance1;
            console.log("cash credit for current account",balance3);
            return balance3;
            
            }
            else
            
            console.log("Balance for current account",balance3);
            return balance3;
        }
        showBalance = ()=>{let b = this.getInterest()+this.getCash_credit();
            console.log("---------");
            console.log('the balance in your current account is: '+b);}

}
 
let e=new CurrentAccount(1,100,"Vinnu");
e.getInterest();
e.getCash_credit();
e.showBalance();
let n=new SavingsAccount(2,200,"vinnu");
n.getInterest();
n.getCash_credit();
n.showBalance();