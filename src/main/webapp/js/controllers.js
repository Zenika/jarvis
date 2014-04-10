(function() {
    var Controllers = angular.module('Controllers', ['Services']);
    Controllers.controller('HomeController', function ($scope, $location, Jobs) {
        $scope.goHome = function () {
            $location.path("/");
        };

        // Handling the promise
        Jobs.getJobs().then(function(data) {
            $scope.jobs = data.data.jobs;
        });
    });
})();




