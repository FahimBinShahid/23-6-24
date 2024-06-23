API Note:
It is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.
Implementation Requirements:

public int hashCode()
Returns a hash code value for the object. This method is supported for the benefit of hash tables such as those provided by HashMap.
