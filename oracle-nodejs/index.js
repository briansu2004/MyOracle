var oracledb = require('oracledb');

async function run() {
  let connection = await oracledb.getConnection({
    user: 'system',
    password: 'admin',
    connectString: 'localhost:1521/xe', // [hostname]:[port]/[DB service name]
  });
  let result = await connection.execute("SELECT 'Hello World!' FROM dual");
  console.log(result.rows[0]);
}

run();
