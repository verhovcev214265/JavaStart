package sk.com.ymca.java.start.lecture1.classwork;

public interface ITaskConstants {

    String COMA = ", ";
    String DOT = ".";
    String DOT_COMA = ";";
    String SPACE = " ";
    String DELIMITER = "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
    String NEW_LINE = System.lineSeparator();
    String OR = " or ";
    String FOR = "for ";

    interface IMessage {
        String INPUT_TEXT = "Enter text: ";
        String INPUT_SIDE1 = "Enter side1 ";
        String INPUT_SIDE2 = "Enter side2 ";
        String INPUT_LEG1 = "Enter leg1 ";
        String INPUT_LEG2 = "Enter leg2 ";
        String INPUT_BASE1 = "Enter base1 ";
        String INPUT_BASE2 = "Enter base2 ";
        String INPUT_WEIGHT = "Enter weight ";
        String INPUT_RADIUS = "Enter radius ";
        String AREA = "area = ";
        String PERIMETER = "perimeter = ";
        String BYE_BYE = "Bye - bye";
        String PRINTING = "What do you want print? ";
        String BOOK = "book ";
        String MAGAZINE = "magazine ";
        String DOCUMENTS_FORMAT = "format.";

        String PLAY = "play";
        String PAUSE = "pause";
        String STOP = "stop";
        String RECORD = "record";
        String PLAY_AND_RECORDING = "play and recording";

        interface IWarningsMessages{
            String INCORRECT_SYMBOL = IColors.RED + "You have entered incorrect symbol!" + IColors.RESET;
            String BY_NULL = IColors.RED + "You have made the wrong object, and that's why it hasn't been added" +
                    " to the array!" + IColors.RESET;
        }
    }

    interface INaming {
        String FIRST_NAME = "name is ";
        String LAST_NAME = "surname is ";
        String TYPE = "type is ";
        String DATA_OF_BIRTH = "data of birth is ";
        String VISA = "Visa: ";
        String ID = "ID: ";
    }

    interface IColors {
        String RESET = "\u001B[0m";
        String BLACK = "\u001B[30m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String WHITE = "\u001B[37m";
    }

    interface IVehicleCharacteristics {
        String COORDINATES = "coordinates: ";
        String GENERAL_PORT = "general port is ";
        String SPEED = "speed = ";
        String YEAR_PRODUCTION = "year production is ";
        String HEIGHT = "height is ";
        String NUMBERS_OF_PASSENGERS = "numbers of passengers = ";
    }

    interface IShapes{
        String RECTANGLE = "rectangle ";
        String CIRCLE = "circle ";
        String RIGHT_TRIANGLE = "right triangle ";
        String TRAPEZOID = "trapezoid ";
    }

    interface IFormatDocuments{
        String XML = "XML";
        String TXT = "TXT";
        String DOC = "DOC";

        interface IDocumentManipulation{
            String OPEN = "The document was opened in ";
            String CREATE = "The document was created in ";
            String CHANGE = "The document was changed in ";
            String SAVE = "The document was saved in ";
        }
    }
}
