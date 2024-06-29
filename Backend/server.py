# app.py
from flask import Flask, jsonify , request
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

@app.route('/api/data', methods=['GET'])
def get_data():
    data = {"message": "Hello, World!"}
    return jsonify(data)

if __name__ == '__main__':
    app.run(debug=True)
