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
   getArea()
   {
       console.log(this.height*this.width);
   }
}

  var Rectangle1 = new Rectangle(10,5)
  Rectangle1.getwidth();
  Rectangle1.getheight();
  Rectangle1.getArea();