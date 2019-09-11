//Load express module with `require` directive
var express = require('express')
var app = express()
//Define request response in root URL (/)
// Main window: sends a 'Hello World' message
app.get('/', function (req, res) {
  res.send('Hello World')
})


//Launch listening server on port 8080
app.listen(8080, function () {
  console.log('App listening on port 8080!')
})

/// Function that returns  'hello'
module.exports = {
	sayHello: function(){
		return 'hello';
	}
}
