var express = require('express');
var router = express.Router();


/* GET page of logout. */
router.get('/', function(req, res, next) {
    req.session.destroy((err)=>{
        if(err){
            console.log(err);
            res.end("Error")
        } else {
            res.render('login', {message:"Logout Success!"})
        }
    })
});

module.exports = router;