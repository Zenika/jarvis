angular.module('Controllers', ['Services', 'ui.bootstrap'])
.controller('HomeController', ['$scope', '$location', 'Jenkins', 'Jobs', 
                               function ($scope, $location, Jenkins, Jobs) {
  'use strict';
  $scope.Jenkins = Jenkins;
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
}]);




