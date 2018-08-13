/**
 * Created by TiTo on 2/19/2017.
 */

export default class EmptyResponseException {

    constructor() {
        this.type = 'EMPTY_RESPONSE';
        this.message = 'empty response';
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