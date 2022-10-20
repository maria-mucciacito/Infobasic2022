const { query } = require('express');
var express = require('express');
var router = express.Router();
var db = require('./db');


/* GET page of login. */
router.get('/', function(req, res, next) {
  res.render('login');
});

router.post('/',(req,res)=>{
  var user = req.body.username;
  var password = req.body.password;
  var values = [user,password];
  var text = 'SELECT * FROM utente WHERE email = $1 AND password = $2;';
  db.query(text,values,(err,result)=> {
    if(err){
      console.log(err.stack)
    }
    console.log(result)
    if(result.rows != ''){
      res.render('index');
    } else {
      res.render('login', { message:'Le credenziali sono errate!' });
    }
  });
})
module.exports = router;