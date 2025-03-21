/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length !== t.length) return false;

    let arr = s.split('').sort();  
    let arr2 = t.split('').sort();

    return arr.join('') === arr2.join('');  
};
