/**
 * Defining here the javascript server based on express to avoid having to handle the routing manually
 */
(function() {
	'use strict';
	// Getting dependencies
	var express = require('express');
	// our custom znkHttp wrapper
	var $http = require('./znkHttp.js');

	// Loading useful objects
	var app = express();
	var router = express.Router();

	/**
	 * Returns a promise which is going to provide jenkins jobs.
	 */
	var getJobs = function() {
		return $http.get('localhost', 8090, '/api/json');		
	}

	/**
	 * Returns a promise which is going to get the information about a job.
	 */
	var getJob = function(jobName) {
		return $http.get('localhost', 8090, '/job/' + jobName + '/api/json');		
	}
	// Setting parameters
	app.set('public', '../src/main/webapp/');

	// Defining the public folder for ui
	app.use('/', express.static(app.get('public')));

	// Finally declaring our APIs
	app.get('/api/job/:jobName', function(req, res) {
		getJob(req.params.jobName).then(
			function(data) {
				res.status(200).send(data);
			}, 
			function(data) {
				res.status(500).send(data);
			}
		);
	}); 
	app.get('/api/jobs', function(req, res) {
		getJobs().then(
			function(data) {
				res.status(200).send(data);
			}, 
			function(data) {
				res.status(500).send(data);
			}
		);
	})
	
	// Runs the server to get the data
	var port = 8080;
	app.listen(port);
	console.log('Listening on port : ' + port);
})();
