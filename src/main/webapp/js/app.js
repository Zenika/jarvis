(function() {
    var app = angular.module("jarvis", ['ngRoute', 'ngCookies', 'Controllers']);

    app.config(function ($routeProvider) {
        $routeProvider.when('/', {templateUrl:'templates/home.html', controller:'HomeController'});
        $routeProvider.otherwise({redirectTo : '/'});

//        $httpProvider.defaults.headers.common = 'Accept: application/json';
    });

//app.run(function($rootScope, $location, $routeParams) {
//        $rootScope.$on('$routeChangeSuccess', function(e, current, pre) {
//            console.log('Current route name: ' + $location.path());
//            // Get all URL parameter
//            console.log($routeParams);
//        })
//
//    });

})();
