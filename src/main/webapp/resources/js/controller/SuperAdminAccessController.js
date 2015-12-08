var SuperAdminAccessController = function($scope, $http,  $rootScope,
		$log) {
	
	$scope.addChruchinfo = function(church) {
		
		alert('super controller');
		
		$http.post('superAdminAccess/addUserChurchInfo', church).success(function(response) {
			
			if (response) {
				church=null;

				alert("User details added");
				
				$scope.priest = null;
			} else {
				alert("unable to add");
			}

		}).error(function() {
			$log.error("unable to Process");
		});

		
	};
 
	
};