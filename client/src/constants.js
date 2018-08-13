'use strict';

var angular = require('angular');

angular.module('car').constant('carConstants', {
  loginUrl: '/api/basic-auth/admin/admin',
  base_url: 'http://localhost:8080'
});
