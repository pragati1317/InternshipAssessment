# app.py
from flask import Flask, jsonify , request
from flask_cors import CORS
from datetime import datetime
from Backend.connection import get_connection, put_connection
import os

app = Flask(__name__)
CORS(app)

@app.route('/api/data', methods=['GET'])
def get_data():
    # reqbody=request.get_json()
    requestDate=datetime.now()
    formatted_time = requestDate.strftime('%Y/%m/%d %H:%M')
    data={
        "RequestId" : 'get-items',
        "RequestType" : 'GET',
        "RequestTime" : formatted_time,
        "IP address" : request.remote_addr,
        "OS" : os.name,
        "UserAgent" : request.headers.get('User-Agent')
    }
    # updateApiData(cur)
    return jsonify(data)

if __name__ == '__main__':
    app.run(debug=True)
