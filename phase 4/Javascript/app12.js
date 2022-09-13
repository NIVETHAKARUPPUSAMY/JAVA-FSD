// by value vs by reference

// by value
var a = 3;
var b = 2;
console.log(a);
console.log(b);

// by reference
var c = { greeting: 'hi' };

var d = c;
c.greeting = 'hola';
console.log(d);