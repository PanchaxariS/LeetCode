/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var hammingDistance = function(x, y) {
    x = x.toString(2);
    y = y.toString(2);

    // Pad the shorter string with leading zeros
    while (x.length < y.length) x = '0' + x;
    while (y.length < x.length) y = '0' + y;

    let distance = 0;
    for (let i = 0; i < x.length; i++) {
        if (x[i] !== y[i]) {
            distance++;
        }
    }
    return distance;
};
