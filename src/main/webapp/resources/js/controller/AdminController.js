


var AdminController = function($scope, $http, $location, $rootScope,
		$cookieStore,$log) {
	
	
	
	$scope.addPriestinfo = function(priest) {
		
		alert('admin controller');
		
		priest.userid= $rootScope.user.userId;
		$http.post('adminpage/addPriestinfo', priest).success(function(response) {
			
			if (response) {

				alert("Priest details added");
				
				$scope.priest = null;
			} else {
				alert("unable to add");
			}

		}).error(function() {
			$log.error("unable to Process");
		});

		
	};
 
   $scope.addChurchinfo = function(church) {
		
		//alert('admin controller');

		$http.post('adminpage/addChurchinfo',church).success(function(response) {
			
			if (response) {

				alert("Church details added");
				
				$scope.church = null;
			} else {
				alert("unable to add");
			}

		}).error(function() {
			$log.error("unable to Process");
		});

		
	};
	
	$scope.addEvents = function(events) {
		
		alert('admin controller');

		$http.post('adminpage/addEvents',events).success(function(response) {
			
			if (response) {

				alert("Events details added");
				
				$scope.events = null;
			} else {
				alert("unable to add");
			}

		}).error(function() {
			$log.error("unable to Process");
		});

		
	};
	
	$scope.addFacilities = function(facility) {
		
		//alert('admin controller');

		$http.post('adminpage/addFacilities',facility).success(function(response) {
			
			if (response) {

				alert("Facilities Detail added");
				
				$scope.church = null;
			} else {
				alert("unable to add");
			}

		}).error(function() {
			$log.error("unable to Process");
		});

		
	};
	
	$scope.churchFacility = function() {
		
		alert('admin controller');

		$http.get('adminpage/churchFacility').success(function(response) {
			
			$scope.churchFacilities = response;

		}).error(function() {
			$log.error("unable to Process");
		});

		
	};
	
	$scope.churchFacility();
 };