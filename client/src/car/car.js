'use strict';
var angular = require('angular');

function carCtrl($scope, $state, $filter) {
    $scope.state = 'Car'
    $scope.title = 'client';
    $scope.navBar = require('../includes/navbar.html')
    $scope.links = $state.get()
        .filter(x => x.name.startsWith('home.'))
        .map(x => {
            return {
                title: x.url.slice(1),
                link: $state.href(x.name)
            }
        });
}

var stateConfig = {
    name: 'cars',
    url: '/cars',
    templateUrl: require('./home.html'),
    controller: 'carCtrl'
};

carCtrl.$inject = [
    '$scope',
    '$state',
    '$filter'
]

function routeConfig($stateProvider) {
    $stateProvider.state(stateConfig)
}

angular.module('car')
    .controller('carCtrl', carCtrl)
    .config([ '$stateProvider', routeConfig ])

module.exports = stateConfig;
