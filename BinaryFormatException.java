public class BinaryFormatException extends Exception {
    private String errorMessage; // creates an error message of type string for the BinaryForatException
    BinaryFormatException(String invalidEntry) // passing the invalid string to get assigned to the error message
    {
        this.errorMessage = invalidEntry;
    }

    // override the toString method to just print the error message
    @Override
    public String toString() {
        return errorMessage;
    }
}