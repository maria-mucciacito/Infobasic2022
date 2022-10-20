const Pool = require('pg').Pool;

let credentials = {
    user: "olhdguej",
    host: "lucky.db.elephantsql.com",
    database: "olhdguej",
    password: "QAps0dGXP-wxx-k-hUixdmQlvsh_943v",
    port: 5432,
};

let pool = new Pool(credentials);

//module.exports = pool;
module.exports = {
    getPool: function () {
      if (pool) return pool; // if it is already there, grab it here
      pool = new pg.Pool(credentials);
      return pool;
    }
}
