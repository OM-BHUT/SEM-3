const http = require('http');
const fs = require('fs');
const path = require('path');

let server = http.createServer((req, res) => {
    res.setHeader('Content-Type', 'text/html');

    fs.readFile('new.html', (err, data) => {
            res.writeHead(200);
            res.end(data);
    });
});

server.listen(4200, () => {
    console.log('Server running on http://localhost:4200');
});
                                                                                                        host:4200');
});
                                                                                                                                                                                    