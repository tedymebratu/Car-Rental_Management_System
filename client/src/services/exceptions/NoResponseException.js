/**
 * Created by TiTo on 2/19/2017.
 */

export default class NoResponseException {

    constructor() {
        this.type = 'NO_RESPONSE';
        this.message = 'The servers dont response';
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