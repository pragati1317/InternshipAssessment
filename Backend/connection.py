# db.py
import psycopg2
from psycopg2 import pool

# Configure the connection pool
try:
    conn_pool = psycopg2.pool.SimpleConnectionPool(1, 20,
                                                   user="postgres",
                                                   password="TOnu@6300",
                                                   host="localhost",
                                                   port="5432",
                                                   database="MyDatabase")
    if conn_pool:
        print("Connection pool created successfully")
except (Exception, psycopg2.DatabaseError) as error:
    print("Error while connecting to PostgreSQL", error)

def get_connection():
    try:
        return conn_pool.getconn()
    except (Exception, psycopg2.DatabaseError) as error:
        print("Error getting connection from pool", error)
        return None

def put_connection(conn):
    try:
        conn_pool.putconn(conn)
    except (Exception, psycopg2.DatabaseError) as error:
        print("Error returning connection to pool", error)
