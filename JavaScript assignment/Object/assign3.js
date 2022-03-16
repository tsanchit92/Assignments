class Rectangle {
    constructor(width,height){
      this.width=width;
      this.height=height;
    }
 getArea()
 {
 console.log("Area is: "+this.width*this.height);
 }
  }


  var Rectangle1 = new Rectangle(10,5)
 Rectangle1.height=50;
  Rectangle1.getArea();