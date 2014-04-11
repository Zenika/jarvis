(function() {
	'use strict';
	// Getting dependencies
	var express = require('express');

	// Loading useful objects
	var app = express();
	var router = express.Router();

	// Setting parameters
	app.set('public', '../src/main/webapp/');

	// Defining the public folder for ui
	app.use('/', express.static(app.get('public')));

	// Finally declaring our APIs
	app.get('/api/job', function(req, res) {
		res.status(501).send();
	}); 
	app.get('/api/jobs', function(req, res) {
		res.status(501).send();
	})

	
	app.listen(8080);
})();