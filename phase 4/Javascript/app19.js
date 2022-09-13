// call, apply, bind - how 'this' variable is set

// declare object
var person = {
    firstname: 'john',
    lastname: 'doe',
    getFullName: function () {
      var fullname = this.firstname + ' ' + this.lastname;
      return fullname;
    },
  };
  
  console.log(person.getFullName());
  
  var logname = function (lang1, lang2) {
    console.log('logged: ' + this.getFullName());
  };
  
  // logname();
  
  var logPersonName = logname.bind(person);
  
  logPersonName();