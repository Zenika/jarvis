var Services = angular.module("Services", []);

Services.factory("Jobs", function ($http) {

    return {
        getJobs : function(callback) {
                    $http.get('/api/jobs').success(function (data) {
                        callback(data);
                    });
                  },

        getJob : function(callback) {
                    $http.get('/api/job').success(function (data) {
                        callback(data);
                    });
                  }
    }
})


