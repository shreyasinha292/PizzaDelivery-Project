var app = angular.module('pizzeriaApp', ["ngRoute"]);

app.service('menuService', function ($http) {
    this.generateMenu = function () {
/*        var temp = [{
                'item_id': '1',
                'item_name': 'muttonPizza',
                'category': 'non-veg',
                'availability': 1,
                'small_price': 100,
                'medium_price': 200,
                'large_price': 300,
                'description': 'chicken, extra cheese, onion, corn, capsicum, tomato, chillies'
            },
            {
                'item_id': '2',
                'item_name': 'paneerPizza',
                'category': 'veg',
                'availability': 1,
                'small_price': 75,
                'medium_price': 165,
                'large_price': 245,
                'description': 'paneer, extra cheese, onions, tomato, capsicum'
            },
            {
                'item_id': '3',
                'item_name': 'cornPizza',
                'category': 'veg',
                'availability': 0,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '4',
                'item_name': 'mexicanGreenWave',
                'category': 'veg',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '5',
                'item_name': 'barbecuePizza',
                'category': 'non-veg',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '6',
                'item_name': 'wheat tin',
                'category': 'crust',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '7',
                'item_name': 'frsh pan pizza',
                'category': 'crust',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '8',
                'item_name': 'black olive',
                'category': 'veg-toppings',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '9',
                'item_name': 'mushroom',
                'category': 'veg-toppings',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '10',
                'item_name': 'chicken tikka',
                'category': 'nonveg-toppings',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '11',
                'item_name': 'grilled chicken',
                'category': 'nonveg-toppings',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '12',
                'item_name': 'barbecue',
                'category': 'nonveg-toppings',
                'availability': 0,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '13',
                'item_name': 'paneerpizza+coke',
                'category': 'combos',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '14',
                'item_name': 'capsicum',
                'category': 'veg-toppings',
                'availability': 0,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '15',
                'item_name': 'chickenpizza+coke',
                'category': 'combos',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '16',
                'item_name': 'chicken salami',
                'category': 'non-veg',
                'availability': 0,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '17',
                'item_name': 'cheese burst',
                'category': 'crust',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '18',
                'item_name': 'doubleChicken',
                'category': 'non-veg',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            },
            {
                'item_id': '19',
                'item_name': 'manchurianPizza',
                'category': 'veg',
                'availability': 1,
                'small_price': 85,
                'medium_price': 170,
                'large_price': 260,
                'description': 'a simple corn based pizza'
            }
        ];
*/      
    	return $http.get("/PizzaMiniProject/fdsgfwqg").then(function(response){
    		return response.data;
    	});
    }
});


app.controller("appController", function ($scope, menuService) {
    $scope.menuItems;
    menuService.generateMenu().then(function(data){
    	$scope.menuItems = data;
    });
    console.log($scope.menuItems);
    $scope.vegPizzas = [];
    $scope.nonVegPizzas = [];
    $scope.vegToppings = [];
    $scope.nonVegToppings = [];
    $scope.crusts = [];
    $scope.combos = [];
    console.log("Test menu list");
    for (var i = 0; i < $scope.menuItems.length; i++) {
        if (($scope.menuItems[i]["category"] === "veg") & ($scope.menuItems[i]["availability"] === 1)) {
            $scope.vegPizzas.push($scope.menuItems[i]);
        }
    }

    for (var i = 0; i < $scope.menuItems.length; i++) {
        if (($scope.menuItems[i]["category"] === "non-veg") & ($scope.menuItems[i]["availability"] === 1)) {
            $scope.nonVegPizzas.push($scope.menuItems[i]);
        }
    }

    for (var i = 0; i < $scope.menuItems.length; i++) {
        if (($scope.menuItems[i]["category"] === "nonveg-toppings") & ($scope.menuItems[i]["availability"] === 1)) {
            $scope.vegToppings.push($scope.menuItems[i]);
        }
    }

    for (var i = 0; i < $scope.menuItems.length; i++) {
        if (($scope.menuItems[i]["category"] === "veg-toppings") & ($scope.menuItems[i]["availability"] === 1)) {
            $scope.nonVegToppings.push($scope.menuItems[i]);
        }
    }

    for (var i = 0; i < $scope.menuItems.length; i++) {
        if (($scope.menuItems[i]["category"] === "crust") & ($scope.menuItems[i]["availability"] === 1)) {
            $scope.crusts.push($scope.menuItems[i]);
        }
    }

    for (var i = 0; i < $scope.menuItems.length; i++) {
        if (($scope.menuItems[i]["category"] === "combos") & ($scope.menuItems[i]["availability"] === 1)) {
            $scope.combos.push($scope.menuItems[i]);
        }
    }
});

app.config(function ($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "home.html"
        })
        .when("/menu", {
            templateUrl: "menu.html"
        })
        .when("/customize", {
            templateUrl: "customize.html"
        })
        .when("/about", {
            templateUrl: "about.html"
        })
        .when("/contact", {
            templateUrl: "contact.html"
        })
        .when("/orders", {
            templateUrl: "orders.html"
        })
        .when("/cart", {
            templateUrl: "cart.html"
        })
        .when("/register", {
            templateUrl: "register.html"
        })
        .when("/login", {
            templateUrl: "login.html"
        })
});
//veg, non-veg, combos, crusts, veg toppings, non veg toppings;