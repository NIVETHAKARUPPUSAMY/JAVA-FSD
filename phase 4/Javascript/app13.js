// this keyword
// console.log(this);

function x() {
    console.log(this);
    var xvar = 30;
    this.yvar = 20;
  }
  
  x();
  // console.log(xvar);
  // console.log(yvar);
  
  var c = {
    namex: 'The c object',
    log: function () {
      this.namex = 'updated c';
      console.log(this);
      var newvar = function () {
        console.log(this);
      };
      newvar();
    },
  };
  
  c.log();
  // console.log(namex);