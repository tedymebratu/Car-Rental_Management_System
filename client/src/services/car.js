'use strict';

function CarSvc($q, Restangular){

    let resource = Restangular.all('cars');

    function fnGetAll () {
        let def = $q.defer();

        let promise = resource.customGET();

        promise.then(
            function (objResponse) {
                def.resolve(angular.copy(objResponse.data));
            }, function (objResponse) {
                def.resolve(angular.copy(objResponse.data));
            }
        );

        return def.promise;
    }
    function fnFind(){
        console.log("entering here");
    }
  return {
    fnGetAll: fnGetAll,
    fnFind: fnFind
  }

}



const serviceConfig = [
  '$q',
  'Restangular',
  CarSvc
]

angular.module('car')
  .factory('CarSvc', serviceConfig)

module.exports = {
  name: 'CarSvc',
  factory: serviceConfig
}
