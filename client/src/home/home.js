'use strict';
var angular = require('angular');

require('../css/home.css')

function homeCtrl($scope, $sessionStorage, $state, $filter, LoginSvc, CarSvc) {
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
  let promise = CarSvc.fnGetAll();
    promise.then(function (objData) {
      $scope.cars = objData._embedded.cars;
    });



  $scope.signout = signout;

  function signout(){
    LoginSvc.logout()
    $state.go('login')
  }

}

var stateConfig = {
  name: 'home',
  url: '/home',
  templateUrl: require('./home.html'),
  controller: 'homeCtrl'
};

homeCtrl.$inject = [
  '$scope',
  '$sessionStorage',
  '$state',
  '$filter',
  'LoginSvc',
  'CarSvc'
]

function routeConfig($stateProvider) {
  $stateProvider.state(stateConfig)
}

angular.module('car')
  .controller('homeCtrl', homeCtrl)
  .config([ '$stateProvider', routeConfig ])

module.exports = stateConfig;
