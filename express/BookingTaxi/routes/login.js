var express = require('express');
var router = express.Router();
var dbPool = require('./db');
var db = dbPool.getPool();
const checkSignIn = require('../middleware');
//sessione per login
const session = require("express-session");
const passport = require('passport');

function checkAuthenticated(req,res,next){
  if(req.isAuthenticated()){
    return next()
  }
  res.redirect('/login')
}

function checkNotAuthenticated(req,res,next){
  if(req.isAuthenticated()){
    return res.redirect('/dashboard')
  }
  next()
}

/* GET page of login. */
router.get('/',checkNotAuthenticated ,function(req, res, next) {
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

router.post('/',passport.authenticate('local',{
  successRedirect: '/dashboard',
  failureRedirect: '/login',
  failureFlash: true
}))

module.exports = router;