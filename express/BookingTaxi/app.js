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
var TaxiRouter = require('./routes/crud/Taxi');
var PaymentRouter = require('./routes/crud/Pagamento');
var UserRouter = require('./routes/crud/User');
var PrenotationRouter = require('./routes/crud/Prenotazione');


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
app.get('/dashboard/taxi', TaxiRouter.getTaxis);
app.get('/dashboard/taxi/:id', TaxiRouter.getTaxiById);
app.post('/dashboard/taxi', TaxiRouter.createTaxi);
app.put('/dashboard/taxi/:id', TaxiRouter.updateTaxi);
app.delete('/dashboard/taxi/:id', TaxiRouter.deleteTaxi);
//app.get('/dashboard/taxt/form', TaxiRouter.FormUpdateTaxi);
//Interrogazione CRUD entity payment
app.get('/dashboard/payment', PaymentRouter.getPayments);
app.get('/dashboard/payment/:id', PaymentRouter.getPaymentById);
app.post('/dashboard/payment', PaymentRouter.createPayment);
app.put('/dashboard/payment/:id', PaymentRouter.updatePayment);
app.delete('/dashboard/payment/:id', PaymentRouter.deletePayment);
//Interrogazione CRUD entity user
app.get('/dashboard/user', UserRouter.getUsers);
app.get('/dashboard/user/:id', UserRouter.getUserById);
app.post('/dashboard/user', UserRouter.createUser);
app.put('/dashboard/user/:id', UserRouter.updateUser);
app.delete('/dashboard/user/:id', UserRouter.deleteUser);
//Interrogazione CRUD entity prenotazione 
app.get('/dashboard/prenotation', PrenotationRouter.getPrenotations);
app.get('/dashboard/prenotation/:id', PrenotationRouter.getPrenotationById);
app.post('/dashboard/prenotation', PrenotationRouter.createPrenotation);
app.put('/dashboard/prenotation/:id', PrenotationRouter.updatePrenotation);
app.delete('/dashboard/prenotation/:id', PrenotationRouter.deletePrenotation);

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
