class StringClass {
    public static void main(String[] args) {

        // CompareTo Method -->>

        String a = "Abc";
        String b = "Abcd";
        // as "Abc" less than "Abcd", Output will be a value less than zero
        System.out.println(a.compareTo(b));

        String x = "Abc";
        String y = "Abc";
        // as "Abc" equals "Abc", Output will be zero
        System.out.println(x.compareTo(y));

        String w = "Abcd";
        String z = "Abc";
        // as "Abcd" is greater than "Abc", Output will be a value greater than zero
        System.out.println(w.compareTo(z));

        // -----------------------------------------------------------------

        // Concat() -->>

        String c = "Siliguri";
        String d =" Engineering";
        String e = c.concat(d);
        System.out.println(e);

        // -----------------------------------------------------------------

        // Equals() -->>

        String s1 ="Kolkata";
        String s2 ="Kolkata";
        String s3 = "kolkata";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // -----------------------------------------------------------------

        // Split() -->>

        String str = "Siliguri Engineering College";
        String[] arrOfStr = str.split(" ", 2); // 0 and -1

        for (String j : arrOfStr)
        System.out.println(j);

        // -----------------------------------------------------------------

        // Length() -->>

        String str11 = "Siliguri Engineering College";
        int l = str11.length();
        System.out.println(l);

        // -----------------------------------------------------------------

        // Replace() -->>

        String s12 = "Kolkata Engineering College";
        System.out.println(s12.replace("Kolkata", "Siliguri"));

        // -----------------------------------------------------------------

        // charAt() -->>

        String s4 = "kokata";
        char a1 = s4.charAt(0);
        System.out.println(a1);

        // -----------------------------------------------------------------

        // Substring() -->>

        String d1="Siliguri Engineering College";
        String e1 = d1.substring(7);
        String f1 = d1.substring(7, 19);
        System.out.println(e1);
        System.out.println(f1);

    }
}
