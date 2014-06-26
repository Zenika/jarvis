angular.module("jarvis", ['ngRoute', 'ngCookies', 'Controllers'])
.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {templateUrl:'templates/home.html', controller:'HomeController'});
    $routeProvider.otherwise({redirectTo : '/'});
}])
.constant('Jenkins', {url: '192.168.1.50', port:8090});
