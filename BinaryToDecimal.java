class BinaryToDecimal {
    // The following function converts a binary string to a decimal
        static int binaryToDecimal(String stringToConvert) throws BinaryFormatException { // throws Binary Exception
            int decimalEquiv = 0;
            for (int i = (stringToConvert.length() - 1), j = 0; i >= 0; i--, j++) {
                if (stringToConvert.charAt(i) == '1' || stringToConvert.charAt(i) == '0') // if the char is at index 0 or 1
                {
                    if (stringToConvert.charAt(i) == '1')  // if at index 1
                    {
                        decimalEquiv = decimalEquiv + (int) Math.pow(2, j); // typecast the string to an int and add it to the decimal value
                    }
                } else {
                    throw new BinaryFormatException("An invalid binary string was entered."); // throw exception for if the Binary String entered is invalid
                }
            }
            return decimalEquiv; // returns the decimal value after going through the entire string
        }
    }

