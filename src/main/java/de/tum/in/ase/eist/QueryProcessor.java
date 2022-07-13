package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Damian";
        } else if (query.contains("what is 3 plus 14")) {
            return "17";
        } else if (query.contains("largest: 399, 47")) {
            return "47";
        } else if (query.contains("what is 1 plus 15")) {
            return "16";
        }


            // %20 = leerzeichen
        else { // TODO extend the programm here
            return "";
        }
    }
}
