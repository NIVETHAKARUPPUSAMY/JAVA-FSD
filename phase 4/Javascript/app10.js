greet();

// function statement
function greet() {
  console.log('hi');
}

// function expression
var anonymousgreet = function () {
  console.log('hi again');
};
anonymousgreet();

// whatever it gets, it will log it
function log(a) {
  console.log(a);
}

var b = 3;
log(b);
log(5);
log('hello');
log({ greeting: 'hi' });
log(function () {
  console.log('hi from func');
});
log(() => {
  console.log('some more');
});

function newlog(b) {
  b();
}
newlog(function () {
  console.log('print something');
});