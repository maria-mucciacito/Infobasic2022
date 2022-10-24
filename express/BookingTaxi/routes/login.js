var express = require('express');
var router = express.Router();
var dbPool = require('./db');
var db = dbPool.getPool();
const credentials= {
  email: "admin@example.it",
  password: "admin"
}

/* GET page of login. */
router.get('/', function(req, res, next) {
  res.render('login');
});

router.post('/',(req,res)=>{
  var user = req.body.username;
  var password = req.body.password;
  var values = [user,password];
  if(user==credentials.email && password==credentials.password){
    req.session.user = user
    res.redirect('/login/dashboard')
  } else {
    res.end("Invalid")
  }
  var text = 'SELECT * FROM utente WHERE email = $1 AND password = $2;';
  db.query(text,values,(err,result)=> {
    if(err){
      console.log(err.stack)
    }
    if(result.rows != ''){
      res.render('index');
    } else {
      res.render('login', { message:'Le credenziali sono errate!' });
    }
  });
})

router.get('/dashboard',(req,res)=>{
    if(req.session.user){
      res.render('dashboard/dashboard',{user:req.session.user})
    }else{
      res.end("Unauthorize User")
    }
  })

module.exports = router;