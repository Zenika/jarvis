require('../src/utils.js');
var chai = require('chai');

describe('Testing the string format method', function() {
  it('should have added a format method to the prototype', function() {
    chai.expect(String.prototype.format).to.be.a('function');
  });
  
  it('should format properly a string', function() {
    chai.expect("hello {0}".format('bar')).to.equal('hello bar');
  });
  
  it('should format properly even with too much params', function() {
    chai.expect("hello {0}".format('bar', 'foo')).to.equal('hello bar');
  });
  
  it('should let some replacement empty if not enough params', function() {
    chai.expect("hello {0} {1} {2}".format('bar', 'foo')).to.equal('hello bar foo {2}');
  });
})