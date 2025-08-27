import jaydebeapi

# Path to the JDBC driver .jar
hsqldb_jar = r"C:\hsqldb\lib\hsqldb.jar"   # change to your path

# Driver class (modern) – older docs use "org.hsqldb.jdbcDriver"
driver_class = "org.hsqldb.jdbc.JDBCDriver"

url = "jdbc:hsqldb:hsql://localhost/"
user = "SA"
password = ""  # default often empty in examples; set yours


conn = jaydebeapi.connect(
    driver_class,
    url,
    [user, password],
    jars=hsqldb_jar
)

cur = conn.cursor()

#just some test value
sql = "INSERT INTO DATA (VALUE, LABEL) VALUES( 9.02, 'A' );"
cur.execute( sql )

#an other test value
sql = "INSERT INTO DATA (VALUE, LABEL) VALUES( -21.9, 'B' );"
cur.execute( sql )
conn.commit()
print('Inserts successfull.')

cur.close()
conn.close()
