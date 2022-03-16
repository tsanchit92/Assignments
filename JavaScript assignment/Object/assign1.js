class Rectangle
{
    constructor(width,height)
    {
      this.width=width;
      this.height=height;
    }
    getwidth()
    {
       console.log('The width is : '+this.width);
    }
   getheight()
   {
      console.log('The height is : '+this.height);
   }
}

  var Rectangle1 = new Rectangle(10,5)
  Rectangle1.getwidth();
  Rectangle1.getheight();

  var Rectangle2 = new Rectangle(20,10)
  Rectangle2.getwidth();
  Rectangle2.getheight();

  Rectangle1.height=15;
  Rectangle1.width=7.5;
  Rectangle1.getheight();
  Rectangle1.getwidth();