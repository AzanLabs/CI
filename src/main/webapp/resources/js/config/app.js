/**
 * app.js
 */

"use strict";

var 
	 //the HTTP headers to be used by all requests
	httpHeaders,
	
	//the message to be shown to the user
    message,

	app = angular.module('ciApp', [,'ngRoute','ngCookies']);

	// Declare app level module which depends on filters, and services
	app.config(['$routeProvider','$locationProvider','$httpProvider','$controllerProvider', 
	            function($routeProvider, $locationProvider, $httpProvider, $controllerProvider) {
		
		$controllerProvider.allowGlobals();
		
		$routeProvider.when('/signin', {
			templateUrl : 'signin/layout',
			controller : signinController
			})
			
		$routeProvider.when('/superAdminAccess', { 
			templateUrl: 'superAdminAccess/layout',
			controller: SuperAdminAccessController 
			})
			
		$routeProvider.when('/adminpage', { 
			templateUrl: 'adminpage/layout',
			controller: AdminController 
			})
			
			
			.otherwise({
			redirectTo : '/signin'
			});
		
	 }]);
		
	
	app.run(['$rootScope','$location','$http','$cookieStore', 
	         function($rootScope,$location,$http,$cookieStore) {
		
	}]);
	