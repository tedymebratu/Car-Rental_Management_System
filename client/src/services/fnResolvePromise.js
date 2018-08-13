import EmptyResponseException from "./exceptions/EmptyResponseException";
import InvalidResponseException from "./exceptions/InvalidResponseException";
import NoResponseException from "./exceptions/NoResponseException";

export function fnResolvePromise(def, objResponse) {
    if (objResponse.status === -1) {
        def.reject((new NoResponseException).toJSON());
        return;
    }

    let objResponseBody = objResponse.data;

    if (_.isEmpty(objResponseBody)) {
        def.reject((new EmptyResponseException).toJSON());
        return;
    }

    if (!angular.isObject(objResponseBody)) {
        def.reject((new InvalidResponseException).toJSON());
        return;
    }

    if (objResponseBody.status === 'success') {
        def.resolve(angular.copy(objResponseBody.data));
        return;
    }

    if (objResponseBody.status === 'error') {
        def.reject(objResponseBody.error);
        return;
    }

}