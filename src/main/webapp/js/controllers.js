var Controllers = angular.module('Controllers', ['Services']);

Controllers.controller('HomeController', function ($scope, $location, Jobs) {
    $scope.goHome = function () {
        $location.path("/");
    };

    Jobs.getJobs(function(data) {
        $scope.jobs = data.jobs;
    });
})


