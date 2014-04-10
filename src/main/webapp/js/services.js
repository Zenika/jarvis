// wrapping everything inside a auto called function to keep JS best practices
(function() {
    var Services = angular.module("Services", []);

    Services.factory("Jobs", function ($http) {

        // Returning promises instead of using callbacks.
        return {
            getJobs : function() {return $http.get('/api/jobs');},
            getJob : function() {return $http.get('/api/job');}
        };
    });
})();



