interface Printable{
    printAll(Objects)
  }
  class Circle implements Printable{
      printAll(Objects) {
          console.log('Circle '+Objects)
      }
      
  }
  class Employee implements Printable{
      printAll(Objects){
         console.log('Employee: '+Objects)
      }
  }
  let o  = new Employee();
  o.printAll('Vinnu');
  let r=new Circle();
  r.printAll('is drawn');