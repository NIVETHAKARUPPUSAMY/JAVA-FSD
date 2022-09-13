// closures - very important concept

function greet(greetingMessage) {
    var funcvar = 34;
    return function (name) {
      console.log(funcvar + '. ' + greetingMessage + ' - ' + name);
    };
  }
  
  var x = greet('Welcome');
  
  console.log(x);
  
  x('RK');