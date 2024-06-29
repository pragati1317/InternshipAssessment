import psycopg2

def updateApiData(cur ,data):
    try:
        RequestId =data["RequestId"],
        RequestType = data["RequestType"]
        RequestTime = data["RequestTime"]
        IP_address= data["IP address"]
        Os= data["OS"]
        UA= data["UserAgent"]

        if "Payload" in data and "Content-type" in data : 
            Payload =data["Payload"]
            ContentType=data["Content-type"]
            cur.execute("Select count(*) from ApiData")
            count = cur.fetchone()[0]
            cur.execute("Insert INTO ApiData(id, RequestId, RequestType, RequestTime,Payload ,Content-type, 'Ip address',OS, UserAgent) VALUES(%s, %s, %s, %s, %s, %s,%s, %s, %s)", (count+1, RequestId, RequestType, RequestTime,Payload ,ContentType, Ip_address,Os, UA))
    except (Exception, psycopg2.DatabaseError) as error:
        print(f"Error executing SQL queries: {error}")