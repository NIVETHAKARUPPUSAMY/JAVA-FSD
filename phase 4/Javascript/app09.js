var person = {}; // object literal notation
console.log(person);

person = { firstName: 'Max', lastName: 'Wilson' };
console.log(person);

var john = {
  firstname: 'John',
  lastname: 'Smith',
  address: {
    street: '111 main street',
    city: 'NY',
    state: 'NY',
  },
};
console.log(john);

function greet(box) {
  console.log(
    'Hi ' + box.firstname + ' ' + box.lastname + ' from ' + box.address.city
  );
}

greet(john);
// greet('X');

// greet({
//   firstname: 'Mary',
//   lastname: 'Smith',
// });

console.log(john);
console.log(JSON.stringify(john));

var jsonstring =
  '{"firstname":"Max","lastname":"Johnson","address":{"street":"111 main street","city":"NY","state":"NY"}}';
var max = JSON.parse(jsonstring);
console.log(max);

console.log(greet);