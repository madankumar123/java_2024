public class CHP_14_String_Methods {

        public static void main(String[] args) {
            String name = "Harry";
            // System.out.println(name);
            int value = name.length();
            //System.out.println(value);

            //String lstring = name.toLowerCase();
            //System.out.println(lstring);

            //String ustring = name.toUpperCase();
            //System.out.println(ustring);

            //String nonTrimmedString = "     Harry     ";
            //System.out.println(nonTrimmedString);
                        //    or
            //String trimmedString = nonTrimmedString.trim();
            //System.out.println(trimmedString);

            //substring(int strat)
            //System.out.println(name.substring(1));

            //substring(int strat, int end)
            //System.out.println(name.substring(1,5));

            //Replace
            //System.out.println(name.replace('r', 'p'));
            //System.out.println(name.replace("r", "ier"));

            //starts with & ends with
            //System.out.println(name.startsWith("Har"));
            //System.out.println(name.endsWith("dd"));

            //charAt
            //System.out.println(name.charAt(4));

            String modifiedName = "Hararyrryrryrryrry";
            System.out.println(modifiedName.indexOf("rry"));
            System.out.println(modifiedName.indexOf("rry", 4));
            System.out.println(modifiedName.lastIndexOf("rry", 8));

//            //System.out.println(name.equals("Harry"));
//            System.out.println(name.equalsIgnoreCase("HarRY"));
//
//            //Escape Sequence character
//            System.out.println("I am escape sequence\tdouble quote");




        }
    }


