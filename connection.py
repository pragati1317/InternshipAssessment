import psycopg2

# Connect to your PostgreSQL database
try:
    conn = psycopg2.connect(
        dbname="your_db_name",
        user="your_username",
        password="your_password",
        host="your_host",
        port="your_port"
    )
    if conn:
       print("Connection pool created successfully")
       cur = conn.cursor()
except (Exception , psycopg2.DatabaseError) as error:
    print('Error while connecting to PostgreSQL', error)
# Create a cursor object


# # Execute a query
# cur.execute("SELECT version();")

# # Fetch the result
# db_version = cur.fetchone()
# print(db_version)

# Close the cursor and connection
# cur.close()
# conn.close()
