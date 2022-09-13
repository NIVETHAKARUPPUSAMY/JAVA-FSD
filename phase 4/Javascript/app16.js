// IIFEs
// all frameworks uses IIFE
// helps avoid var. collision and create safe code
// Immediately Invokable Function Expressions
var newvar = 20;

// function expression
var greet1 = function () {
  console.log('hi');
};

// IIFEs
var greet2 = (function () {
  var newvar = 30;
  console.log('hi again');
  console.log('2. ' + newvar);
})();

console.log('1. ' + newvar);

// anonymousgreet();