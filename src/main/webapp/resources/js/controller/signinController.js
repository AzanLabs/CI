/**
 * signinController.js
 */


var signinController = function($scope, $http, $location, $rootScope, $cookieStore,$log){
	
	$rootScope.churchDetails='';
	$scope.authenticateUser = function(login){
		 
		alert('login controller');
		
		$http.post('signin/userdetails',login).success(function(data){
			
			JSON.stringify("login :"+login);	
			JSON.stringify("data :"+data);
			
			 if(data.message == 'SUCCESS'){
				 $rootScope.loginfaile=false;
					
				 $rootScope.user = data;
				
				 $cookieStore.put('authToken',  $rootScope.user);
				/* if($rootScope.user.role=='ADMIN')
					 {*/
					
				     $("#loginModal").modal("hide");    
				 
					 $location.path('/adminpage');
					
					
					/* }
				 else
					 {
					 $location.path('/home');
					 }*/
				 
			 }else {
				 $rootScope.loginfaile=true;
				 alert("Login Failed");
				 $scope.user=data;
			 }
			
		 }).error(function() {
				alert("Error Sign in user");
			});
		 
		
	 };
	
	$scope.showLoginModel = function() {

		$("#loginModal").modal("show");

	};
	
	$scope.getAllCountry = function() {
		
		$http.get('signin/country').success(function(response) {

			$scope.countryNameList = response;
			
		}).error(function() {
			$log.error("unable to  fetch country drop down values");
		});
	};
	
	$scope.onCountryChange = function(country) {

		$http.get('signin/state/'+country).success(function(response) {

				$scope.stateNameList = response;
				

		}).error(function() {
			$log.error("unable to fetch state drop down values");
		});
	};
	
	$scope.getAllDistrict = function(state) {
		
		

		$http.get('signin/district/'+state).success(function(response) {

				$scope.distNameList = response;
				
		}).error(function() {
			$log.error("unable to fetch district drop down values");
		});
	};
	
    $scope.getAllCity = function(district) {
		
		

		$http.get('signin/city/'+district).success(function(response) {

				$scope.cityNameList = response;
				
		}).error(function() {
			$log.error("unable to fetch district drop down values");
		});
	};
	
   $scope.getAllChurch = function(city) {
		
		
		$http.get('signin/church/'+city).success(function(response) {

				$scope.churchNameList = response;
				
		}).error(function() {
			$log.error("unable to fetch district drop down values");
		});
	};
	
	$scope.changeSessionChurch = function(church) {
			
			

			$http.get('signin/churchInfo/'+church).success(function(response) {

				$rootScope.churchDetails = response;
					
				$("#churchDetailsModel").modal("hide");
					
			}).error(function() {
				$log.error("unable to fetch district drop down values");
			});
		};
		
	
	$scope.churchDetailsModelView = function() {

		$("#churchDetailsModel").modal("show");
		
	};
	
	$scope.churchDetailsModelView();
	$scope.getAllCountry();
};
