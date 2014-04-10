(function() {
    var Controllers = angular.module('Controllers', ['Services', 'ui.bootstrap']);
    Controllers.controller('HomeController', function ($scope, $location, Jobs) {
        $scope.goHome = function () {
            $location.path("/");
        };

        // Handling the promise
        Jobs.getJobs().then(function(data) {
            $scope.jobs = data.data.jobs;
        });

        $scope.loadJob = function(jobName) {

            Jobs.getJob(jobName).then(function(resp) {
               $scope.jobDetail = resp.data;
            });
        }
    });
})();




