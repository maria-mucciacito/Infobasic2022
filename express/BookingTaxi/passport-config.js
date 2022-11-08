const LocalStrategy = require('passport-local').Strategy;
var dbPool = require('./routes/db');
var db = dbPool.getPool();
const bcrypt = require('bcrypt');

function initialize(passport){
    const authenticateUser = async (email,password,done)=>{
        db.query('SELECT * FROM utente WHERE email=$1 AND ruolo="amministratore" ', [email], (error,results)=>{
            if(error){
               console.log(error)
            } else {
                user = results.rows[0]
            }
        })
        if(user==null){
           return done(null,false,{messagge: "No user with that email"})
        }
        try{
            if(await bcrypt.compare(password,user.password)){
                return done(null,user)
            }else {
                return done(null,false,{messagge:"Password incorrect"})
            }
        } catch(e){
            return done(e)
        }
    }
    passport.use(new LocalStrategy({usernameField: 'email'},authenticateUser))
    passport.serializeUser((user,done)=>done(null,user.id ))
    passport.deserializeUser((id,done)=>{

    })

}

module.exports = initialize 