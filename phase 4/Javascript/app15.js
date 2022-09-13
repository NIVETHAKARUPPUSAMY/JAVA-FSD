// arguments and spread

function greet(firstname, lastname, ...others) {
    console.log('Welcome ' + firstname + ' ' + lastname);
    console.log(others);
  }
  
  greet('John', 'Doe');
  greet('John');
  greet('John', 'Doe', 'hello', 'how', 'are', 'you');
  greet('John', 'Doe', 'hello', 'how');