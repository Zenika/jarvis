angular.module("Services", [])
.factory("Jobs", function ($http) {
  // Returning promises instead of using callbacks.
  return {
      getJobs : function() {return $http.get('/api/jobs');},
      getJob : function(jobName) {return $http.get('/api/job/' + jobName);}
  };
});