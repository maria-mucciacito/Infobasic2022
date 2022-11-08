var express = require('express');
var router = express.Router();
var dbPool = require('./db');
var db = dbPool.getPool();
const bcrypt = require('bcrypt');

function checkNotAuthenticated(req,res,next){
if(req.isAuthenticated()){
    return res.redirect('/dashboard')
}
next()
}

/* GET page of logup. */
router.get('/',checkNotAuthenticated, function(req, res, next) {
    res.render('logup');

});

//POST data from page of logup's form html
router.post('/', async (req,res)=> {
    try{
        const {nome,surname,email,codiceFiscale,new_password,password_repeat} = req.body
        db.query('SELECT * FROM utente WHERE email=$1', [email],(err,results)=>{
            if(err){
                throw err
            } else {
                if(results.rows){
                    return res.render('logup', {messagge:"User already exists! Login or choose another username"});
                }
            }
        })
        const hashedPassword = await bcrypt.hash(new_password,10)
        var values = [codiceFiscale,nome,surname,email,hashedPassword];
        var text = 'INSERT INTO utente(codice_fiscale,nome,cognome,email,password) VALUES($1, $2, $3, $4, $5) RETURNING *';
        if(new_password===password_repeat){
            db.query(text,values,(err)=>{
                if(err){
                    console.log(err.stack)
                } else {
                    return res.render('login',{ message: 'L\'utente è stato registrato con successo! Adesso puoi effettuare il login ' });
                }
            })
        } else{
            return res.render('logup', { message: 'Le due password non corrispondono!' });

        }
    } catch(e) {
        console.log(e)
        res.redirect('/logup')
    }

})



module.exports = router;