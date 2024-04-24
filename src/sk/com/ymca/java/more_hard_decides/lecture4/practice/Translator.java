package sk.com.ymca.java.more_hard_decides.lecture4.practice;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Translator {

    public String translate(String word) {
        String output = null;
        switch (word) {
            case "вітер":
                output = "wind";
                break;
            case "сонце":
                output = "sun";
                break;
            case "туман":
                output = "fog";
                break;
            case "сніг":
                output = "snow";
                break;
            case "дощ":
                output = "rain";
                break;
            case "ураган":
                output = "hurricane";
                break;
            case "землетрус":
                output = "earthquake";
                break;
            case "ожеледиця":
                output = "icicle";
                break;
            case "мороз":
                output = "frost";
                break;
            case "шторм":
                output = "the storm";
                break;
            default:
                output = "Sorry but we don't have a translation of you word!";
        }
        return ITaskConstants.IColors.YELLOW + output + ITaskConstants.IColors.RESET;
    }
}
