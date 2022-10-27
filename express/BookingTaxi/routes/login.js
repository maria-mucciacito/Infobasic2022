var express = require('express');
var router = express.Router();
var dbPool = require('./db');
var db = dbPool.getPool();
const checkSignIn = require('../middleware');
//sessione per login
const session = require("express-session");
const {v4:uuidv4} = require("uuid");


/* GET page of login. */
router.get('/', function(req, res, next) {
  res.render('login');
});

/*router.post('/',(req,res)=>{
  const {email,password} = req.body
  var values = [email,password];
  var text = 'SELECT * FROM utente WHERE email = $1 AND password = $2;';




   var user = req.body.username;
  var password = req.body.password;
  var values = [user,password];
  var text = 'SELECT * FROM utente WHERE email = $1 AND password = $2;';
  if(user==credentials.email && password==credentials.password){
    req.session.user = user
    res.redirect('/dashboard') 
  } else {
    db.query(text,values,(err,result)=> {
      if(err){
        console.log(err.stack)
      }
      if(result.rows){
        res.render('index');
      } else {
        res.render('login', { message:'Le credenziali sono errate!' });
      }
    });
    //res.end("Invalid")
  }
  
})*/

router.get('/dashboard',(req,res)=>{
    if(req.session.user){
      res.render('dashboard/dashboard',{user:req.session.user})
    }else{
      res.end("Unauthorize User")
    }
  })

module.exports = router;