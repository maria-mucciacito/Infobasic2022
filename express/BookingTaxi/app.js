var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var hbs = require('hbs');
var db = require('./routes/db');
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
var TaxiRouter = require('./crud/Taxi');
var PaymentRouter = require('./crud/Pagamento');
var UserRouter = require('./crud/User');
var PrenotationRouter = require('./crud/Prenotazione');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'hbs');
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
app.use(session({
  secret: uuidv4(),
  resave: false,
  saveUninitialized: true
}))

//Routers per autentificazione
app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/login', loginRouter);
app.use('/signup', logupRouter);
app.use('/logout', logoutRouter);

//Interrogazione CRUD entity taxi
app.use('/taxi', TaxiRouter.getTaxis);
app.use('/taxi', TaxiRouter.getTaxiById);
app.use('/taxi', TaxiRouter.createTaxi);
app.use('/taxi', TaxiRouter.updateTaxi);
app.use('/taxi', TaxiRouter.deleteTaxi);
//Interrogazione CRUD entity payment
app.use('/payment', PaymentRouter.getPayments);
app.use('/payment', PaymentRouter.getPaymentById);
app.use('/payment', PaymentRouter.createPayment);
app.use('/payment', PaymentRouter.updatePayment);
app.use('/payment', PaymentRouter.deletePayment);
//Interrogazione CRUD entity user
app.use('/user', UserRouter.getUsers);
app.use('/user', UserRouter.getUserById);
app.use('/user', UserRouter.createUser);
app.use('/user', UserRouter.updateUser);
app.use('/user', UserRouter.deleteUser);
//Interrogazione CRUD entity prenotazione 
app.use('/prenotation', PrenotationRouter.getPrenotations);
app.use('/prenotation', PrenotationRouter.getPrenotationById);
app.use('/prenotation', PrenotationRouter.createPrenotation);
app.use('/prenotation', PrenotationRouter.updatePrenotation);
app.use('/prenotation', PrenotationRouter.deletePrenotation);

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


app.listen(3000);

module.exports = app;
