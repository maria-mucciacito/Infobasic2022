var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
//package for login auth
const bcrypt = require('bcrypt');
const initializePassport = require('./passport-config');
const passport = require('passport')
const flash = require('express-flash')
initializePassport(passport )
//require for views hbs
var hbs = require('hbs');
//require for database
var db = require('./routes/db');
//require for passage of paremetres
const bodyParser = require('body-parser')
//credenziali per database
require('dotenv').config();
//sessione per login
const session = require("express-session");
const {v4:uuidv4} = require("uuid");

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var loginRouter = require('./routes/login');
var logupRouter = require('./routes/logup');
var logoutRouter = require('./routes/logout');
var TaxiRouter = require('./routes/crud/Taxi');
var PaymentRouter = require('./routes/crud/Pagamento');
var UserRouter = require('./routes/crud/User');
var PrenotationRouter = require('./routes/crud/Prenotazione');


var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'hbs');
//path for partials(header and footer)
hbs.registerPartials(path.join(__dirname,'views/partials'), (err) => {});

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));
app.use(bodyParser.json())
app.use(
    bodyParser.urlencoded({
      extended: true,
  })
)

//processi per stabilire la sessione per il login
app.use(flash())
app.use(session({
  secret: process.env.SESSION_SECRET,
  resave: false,
  saveUninitialized: false
})) 
app.use(passport.session())
app.use(passport.initialize())


//Routers per autentificazione
app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/login', loginRouter);
app.use('/signup', logupRouter);
app.use('/logout', logoutRouter);

app.get('/dashboard',(req,res)=>{
  res.render('dashboard/dashboard')
  /*if(req.session.user){
    res.render('dashboard/dashboard',{user:req.session.user})
  }else{
    res.end("Unauthorize User")
  }*/
})

//Interrogazione CRUD entity taxi
app.get('/dashboard/taxi/insert', TaxiRouter.insertTaxiForm);
app.get('/dashboard/taxi', TaxiRouter.getTaxis);
app.get('/dashboard/taxi/get/:id', TaxiRouter.getTaxiById);
app.post('/dashboard/taxi', TaxiRouter.createTaxi);
app.post('/dashboard/taxi/:id', TaxiRouter.updateTaxi);
app.get('/dashboard/taxi/delete/:id', TaxiRouter.deleteTaxi);
//Interrogazione CRUD entity payment
app.get('/dashboard/payment/insert', PaymentRouter.insertPaymentForm);
app.get('/dashboard/payment', PaymentRouter.getPayments);
app.get('/dashboard/payment/get/:id', PaymentRouter.getPaymentById);
app.post('/dashboard/payment', PaymentRouter.createPayment);
app.post('/dashboard/payment/:id', PaymentRouter.updatePayment);
app.get('/dashboard/payment/delete/:id', PaymentRouter.deletePayment);
//Interrogazione CRUD entity user
app.get('/dashboard/user/insert', UserRouter.insertUserForm);
app.get('/dashboard/user', UserRouter.getUsers);
app.get('/dashboard/user/get/:id', UserRouter.getUserById);
app.post('/dashboard/user', UserRouter.createUser);
app.post('/dashboard/user/:id', UserRouter.updateUser);
app.get('/dashboard/user/delete/:id', UserRouter.deleteUser);
//Interrogazione CRUD entity prenotazione 
app.get('/dashboard/prenotation/insert', PrenotationRouter.insertPrenotationForm);
app.get('/dashboard/prenotation', PrenotationRouter.getPrenotations);
app.get('/dashboard/prenotation/get/:id', PrenotationRouter.getPrenotationById);
app.post('/dashboard/prenotation', PrenotationRouter.createPrenotation);
app.post('/dashboard/prenotation/:id', PrenotationRouter.updatePrenotation);
app.get('/dashboard/prenotation/delete/:id', PrenotationRouter.deletePrenotation);

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  res.render('notfoundpage');
  //next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});


app.listen(3001);

module.exports = app;
