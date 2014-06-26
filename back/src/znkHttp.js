/**
 * Creating a custom http module to look how are handled the http requests in Node.js
 * We are also using q to avoid callbacks and use promises instead.
 */
(function() {
	var http = require('http');

	/*
	 * Here we decide to use Q because promises are going to simplify our javascript code. 
	 * With promises we can encapsulate the callback hell and avoid nested callback.
	 */
	var Q = require('q');

	exports.get = function(hostname, port, path) {
		return executeRequest(hostname, port, path, 'GET');
	};

	exports.post = function(hostname, port, path, data) {
		throw new Error('Not yet implementend');
	};

	function executeRequest(hostname, port, path, method) {
		// Deferring for the promise
		var deferred = Q.defer();

		// Defining our options object
		var options = {
			hostname: hostname,
			port: port,
			path: path,
			method: method,
			headers: {
				'Content-Type': 'application/json'
			}
		};

		// Creating the request
		var req = http.request(options, function(res) {
			console.log('STATUS: ' + res.statusCode);
			console.log('HEADERS: ' + JSON.stringify(res.headers));
			
			res.setEncoding('utf8');
			

			var body = '';
			// Handling the chunks
			res.on('data', function(chunk) {
				body += chunk;
			});

			// Merging the chunks and resolving the promise
			res.on('end', function() {
				deferred.resolve(body);
				res.emit('close');
			});

			
		});

		// On error we gonna reject the promise
		req.on('error', function(e) {
			deferred.reject(e);
		});	

		// Let's send the request
		req.end();

		// and return the promise right away
		return deferred.promise;
	}
})();
