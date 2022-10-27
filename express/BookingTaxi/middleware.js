//middleware
function checkSignIn(req,res){
    if(req.session.user){
      next();
    } else {
      var err = new Error("Not logged in")
      next(err);
    }
}


/*db.query('SELECT * FROM utente WHERE email=$1', [email],(err,results)=>{
    if(err){
        throw err
    } else {
        if(results.rows){
            res.render('logup', {messagge:"User already exists! Login or choose another username"})
        }
    }
})
db.end()*/

module.exports = checkSignIn