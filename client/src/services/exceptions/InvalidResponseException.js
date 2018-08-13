/**
 * Created by TiTo on 2/19/2017.
 */

export default class InvalidResponseException {

    constructor() {
        this.type = 'INVALID_RESPONSE';
        this.message = 'Invalid response, or json type';
    }

    toString() {
        return this.type + ' - ' + this.message;
    }

    toJSON() {
        return {
            type: this.type,
            message: this.message
        }
    }

}