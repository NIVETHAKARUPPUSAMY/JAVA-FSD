function add(x, y) {
    console.log('add: ' + (x + y));
  }
  
  function multiply(x, y) {
    console.log('multiply: '+( x * y) );
  }
  
  function subtract(x, y) {
    console.log('subtract: ' + (x - y));
  }
  
  function divide(x, y) {
    console.log('division : ' + (x / y));
  }
  
  // add(1, 2);
  // multiply(3, 4);
  // subtract(3, 4);
  // divide(4, 2);
  
  function calculator(operation, num1, num2) {
    operation(num1, num2);
  }
  
  calculator(add, 3, 4);
  calculator(multiply, 3, 4);
  calculator(subtract, 3, 4);
  calculator(divide, 3, 4);