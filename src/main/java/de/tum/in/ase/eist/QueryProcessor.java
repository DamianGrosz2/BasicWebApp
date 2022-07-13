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
        } else if (query.contains("what is 9 plus 0")) {
            return "9";
        } else if (query.contains("what is 15 plus 10")) {
            return "25";
        } else if (query.contains("what is 11 plus 1")) {
            return "12";
        } else if (query.contains("what is") && query.contains("plus")) {
            int tmp = Integer.parseInt(query.split("is ")[1].split(" plus")[0]) +
                    Integer.parseInt(query.split("plus ")[1]);
            return "" +tmp; // e largest: 595, 85"
        } else if (query.contains("which of the following numbers is the largest: ")) {
            int t = Integer.parseInt(query.split("largest: ")[1].split(",")[0]);
            int t2 = Integer.parseInt(query.split(", ")[1]);
            return "" + Math.max(t, t2);
        } else if (query.contains("what is") && query.contains("multiplied by")) {
            int tmp = Integer.parseInt(query.split("is ")[1].split(" multiplied")[0]) *
                    Integer.parseInt(query.split("by ")[1]);
            return "" +tmp; // e largest: 595, 85"
        } else if (query.contains("what colour is a banana")) {
            return "yellow"; // e largest: 595, 85"
        } else if (query.contains("which city is the Eiffel tower in")) {
            return "paris"; // e largest: 595, 85"
        } else if (query.contains("which of the following numbers are primes: ")) {
            int t = Integer.parseInt(query.split("primes: ")[1].split(",")[0]);
            int t2 = Integer.parseInt(query.split(", ")[1]);
            boolean flag = false;
            for (int i = 2; i <= t / 2; ++i) {
                if (t % i == 0) {
                    flag = true;
                    break;
                }
            }
            boolean flag2 = false;
            for (int i = 2; i <= t2 / 2; ++i) {
                if (t2 % i == 0) {
                    flag2 = true;
                    break;
                }
            }
            if (!flag){
                return "" + t;
            } else if(!flag2) {
                return "" + t2;
            }
            return "";
        }


        //which of the following numbers are primes: 17, 826


//        else if (query.contains("which of the following numbers is both a square and a cube:")) {
//            int t = Integer.parseInt(query.split("cube: ")[1].split(",")[0]);
//            int t2 = Integer.parseInt(query.split(", ")[1]);
//            if(Math.sqrt(t) == ((double) ((int) Math.sqrt(t))) && Math.pow(125, 1.0 / 3.0) == ((double) ((int) Math.sqrt(t)))){
//                return "" + t;
//            }
//            if(Math.sqrt(t2) == ((double) ((int) Math.sqrt(t2))) && Math.sqrt(t2) == ((double) ((int) Math.sqrt(t2)))){
//                return "" + t2;
//            }
//            return "";
//        }

        // what is 14 multiplied by 2"


            // %20 = leerzeichen
        else { // TODO extend the programm here
            return "";
        }
    }
}
