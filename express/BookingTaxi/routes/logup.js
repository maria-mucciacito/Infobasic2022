var express = require('express');
var router = express.Router();
var db = require('./db');

/* GET page of logup. */
router.get('/', function(req, res, next) {
  res.render('logup');
});

//POST data from page of logup's form html
router.post('/',(req,res)=> {
    var nome = req.body.name;
    var surname = req.body.surname;
    var email = req.body.username;
    var codiceFiscale =  req.body.codFiscale;
    var new_password = req.body.newpassword;
    var password_repeat = req.body.passwordrepeat;
    var values = [codiceFiscale,nome,surname,email,new_password];
    var text = 'INSERT INTO Utente VALUES($1, $2, $3, $4, $5) RETURNING *';
    if(new_password===password_repeat){
        console.log('eb');
        db.query(text,values,(err)=>{
            if(err){
                console.log(err.stack)
            }
        })
        res.render('logup',{ message: 'L\'utente è stato registrato con successo!' });
    } else {
        res.render('logup', { message: 'Le due password non corrispondono!' });
    }
})



module.exports = router;