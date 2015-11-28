


var AdminController = function($scope, $http, $location, $rootScope,
		$cookieStore) {
	
	
	
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
	
 };