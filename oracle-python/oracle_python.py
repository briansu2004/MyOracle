import cx_Oracle

# Connect string format: [username]/[password]@//[hostname]:[port]/[DB service name]
conn = cx_Oracle.connect("system/admin@//localhost:1521/xe")
cur = conn.cursor()
cur.execute("SELECT 'Hello World!' FROM dual")
res = cur.fetchall()
print(res)
