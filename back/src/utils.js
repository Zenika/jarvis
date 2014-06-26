/**
 * Formats a string and replace the %s with the given values.
 * @param {...} an non fixed size of arguments which represents the replacements for the current String.
 */
if (!String.prototype.format) {
  String.prototype.format = function() {
    var args = arguments;
    return this.replace(/{(\d+)}/g, function(match, number) { 
      return typeof args[number] != 'undefined'
        ? args[number]
        : match
      ;
    });
  };
}