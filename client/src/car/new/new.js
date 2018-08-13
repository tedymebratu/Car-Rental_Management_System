'use strict';
var angular = require('angular');

function newCtrl($scope, $sessionStorage, $state, $filter) {
  $scope.state = 'new'
}

var stateConfig = {
  name: 'new',
  url: '/cars/new',
  templateUrl: require('./new.html'),
  controller: 'newCtrl'
};

newCtrl.$inject = [
  '$scope',
  '$sessionStorage',
  '$state',
  '$filter'
]

function routeConfig($stateProvider) {
  $stateProvider.state(stateConfig)
}

angular.module('car')
  .controller('newCtrl', newCtrl)
  .config([ '$stateProvider', routeConfig ])

module.exports = stateConfig;
